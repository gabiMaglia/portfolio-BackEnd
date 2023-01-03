package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.SocialMedia;
import com.portfolio.Gabriel.Maglia.Interface.ISocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class SocialMediaController {
    @Autowired
    ISocialMediaService isocialMediaService;

    @GetMapping("/get/social")
    public List<SocialMedia> getSocialMedia () {
        return isocialMediaService.getSocialMedia();
    }

    @PutMapping("/edit/social/{id}")
    public SocialMedia editSocialMedia(@PathVariable ("id") Long id,
                                       @RequestBody Map<String, String> body)
                               {
        SocialMedia socialMedia =  isocialMediaService.findSocialMedia(id);
        socialMedia.setInstagram(body.get("instagram"));
        socialMedia.setFacebook(body.get("facebook"));
        socialMedia.setLinkedin(body.get("linkedin"));
        socialMedia.setGithub(body.get("github"));
        socialMedia.setGmail(body.get("gmail"));
        isocialMediaService.saveSocialMedia(socialMedia);
        return socialMedia;
    }


}
