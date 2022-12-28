package com.portfolio.Gabriel.Maglia.Controller;


import com.portfolio.Gabriel.Maglia.Entity.Skills;
import com.portfolio.Gabriel.Maglia.Interface.ISkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Skills> createSocialMedia(@RequestBody Skills skill){
        skillsService.saveSkill(skill);
        return  new ResponseEntity<>(skill, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/skill/{id}")
    public ResponseEntity<?> deleteSocialMedia(@PathVariable Long id){
        skillsService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/edit/skill/{id}")
    public Skills editSkill(@PathVariable ("id") Long id,
                            @RequestBody Map<String, String> body)
    {
        Skills skill =  skillsService.findSkills(id);
        skill.setType(body.get("type"));
        skill.setImg_skill(body.get("img_skill"));
        skill.setName(body.get("name"));
        skill.setAmount(Integer.valueOf(body.get("amount")));

        skillsService.saveSkill(skill);
        return skill;
    }
}
