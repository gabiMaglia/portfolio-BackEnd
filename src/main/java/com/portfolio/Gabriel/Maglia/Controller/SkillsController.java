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

    @GetMapping("get/skill")
    public List<Skills> getSocialMedia () {
        return skillsService.getSkill();
    }
    @PostMapping("/add/skill")
    public String createSocialMedia(@RequestBody Skills skill){
        skillsService.saveSkill(skill);
        return "La SocialMedia fue creada satisfactoriamente";
    }
    @DeleteMapping("/delete/skill/{id}")
    public String deleteSocialMedia(@PathVariable Long id){
        skillsService.deleteSkill(id);
        return "La SocialMedia fue eliminada correctamente";
    }
    @PutMapping("/edit/skill/{id}")
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
