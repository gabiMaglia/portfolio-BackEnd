package com.portfolio.Gabriel.Maglia.Controller;


import com.portfolio.Gabriel.Maglia.Entity.Skills;
import com.portfolio.Gabriel.Maglia.Interface.ISkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class SkillsController {
    @Autowired
    ISkillsService skillsService;

    @GetMapping("/skill/traer")
    public List<Skills> getSocialMedia () {
        return skillsService.getSkill();
    }
    @PostMapping("/skill/crear")
    public String createSocialMedia(@RequestBody Skills skill){
        skillsService.saveSkill(skill);
        return "La SocialMedia fue creada satisfactoriamente";
    }
    @DeleteMapping("/skill/borrar/{id}")
    public String deleteSocialMedia(@PathVariable Long id){
        skillsService.deleteSkill(id);
        return "La SocialMedia fue eliminada correctamente";
    }
    @PutMapping("/skill/editar/{id}")
    public Skills editSkill(@PathVariable Long id,
                                       @RequestParam("type") String newType,
                                       @RequestParam("img_skill") String newImg,
                                       @RequestParam("name") String newName,
                                       @RequestParam("amount")Integer newAmnt)
    {
        Skills skill =  skillsService.findSkills(id);
        skill.setType(newType);
        skill.setImg_skill(newImg);
        skill.setName(newName);
        skill.setAmount(newAmnt);
        skillsService.saveSkill(skill);
        return skill;
    }
}
