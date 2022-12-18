package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.SocialMedia;
import com.portfolio.Gabriel.Maglia.Interface.ISocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class SocialMediaController {
    @Autowired
    ISocialMediaService isocialMediaService;

    @GetMapping("/social/traer")
    public List<SocialMedia> getSocialMedia () {
        return isocialMediaService.getSocialMedia();
    }
    @PostMapping("/social/crear")
    public String createSocialMedia(@RequestBody SocialMedia socialMedia){
        isocialMediaService.saveSocialMedia(socialMedia);
        return "La SocialMedia fue creada satisfactoriamente";
    }
    @DeleteMapping("/social/borrar/{id}")
    public String deleteSocialMedia(@PathVariable Long id){
        isocialMediaService.deleteSocialMedia(id);
        return "La SocialMedia fue eliminada correctamente";
    }
    @PutMapping("/social/editar/{id}")
    public SocialMedia editSocialMedia(@PathVariable Long id,
                               @RequestParam("facebook") String newFacebook,
                               @RequestParam("e_mail") String newEmail,
                               @RequestParam("instagram") String newInstagram,
                               @RequestParam("linkedin")String newLinkedin,
                               @RequestParam("github") String newGithub)
                               {
        SocialMedia socialMedia =  isocialMediaService.findSocialMedia(id);
        socialMedia.setInstagram(newInstagram);
        socialMedia.setFacebook(newFacebook);
        socialMedia.setLinkedin(newLinkedin);
        socialMedia.setGithub(newGithub);
        socialMedia.setE_mail(newEmail);
        isocialMediaService.saveSocialMedia(socialMedia);
        return socialMedia;
    }


}
