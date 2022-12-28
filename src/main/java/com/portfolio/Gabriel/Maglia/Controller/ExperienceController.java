package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Experience;


import com.portfolio.Gabriel.Maglia.Interface.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class ExperienceController {
    @Autowired
    IExperienceService experienceService;

    @GetMapping("/get/experience")
    public List<Experience> getExperience () {
        return experienceService.getExperience();
    }

    @PostMapping("/add/experience")
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return  new ResponseEntity<>(experience, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/experience/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable Long id){
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/edit/experience/{id}")
    public ResponseEntity <Experience> editExperience(@PathVariable("id") Long id,
                                                      @RequestBody Map<String, String> body) {
        Experience experience = experienceService.findExperience(id);
        experience.setTitle_exp(body.get("title_exp"));
        experience.setInstitution_exp(body.get("institution_exp"));
        experience.setIsActualJob_exp(Boolean.valueOf(body.get("is_actual_job_exp")));
        experience.setStartDate_exp(body.get("startDate_exp"));
        experience.setEndDate_exp(body.get("endDate_exp"));
        experience.setDescription_exp(body.get("description_exp"));
        experience.setImg_exp(body.get("img_exp"));

        experienceService.saveExperience(experience);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

}
