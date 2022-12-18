package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Experience;

import com.portfolio.Gabriel.Maglia.Interface.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class ExperienceController {
    @Autowired
    IExperienceService experienceService;

    @GetMapping("/experience/traer")
    public List<Experience> getExperience () {
        return experienceService.getExperience();
    }

    @PostMapping("/experience/crear")
    public String createExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return "La Experience fue creada satisfactoriamente";
    }

    @DeleteMapping("/experience/borrar/{id}")
    public String deleteExperience(@PathVariable Long id){
        experienceService.deleteExperience(id);
        return "La Experience fue eliminada correctamente";
    }

    @PutMapping("/experience/editar/{id}")
    public Experience editExperience(@PathVariable Long id,
                                     @RequestParam ("title_exp") String newTitle,
                                     @RequestParam ("institution_exp") String newInst ,
                                     @RequestParam ("is_actual_job") Boolean newState,
                                     @RequestParam ("start_date_exp") String newStrDate ,
                                     @RequestParam ("end_date_exp") String newEndDate ,
                                     @RequestParam ("description_exp") String newDesc ,
                                     @RequestParam ("img_exp") String newImg ) {
        Experience experience = experienceService.findExperience(id);
        experience.setTitle_exp(newTitle);
        experience.setInstitution_exp(newInst);
        experience.setIsActualJob_exp(newState);
        experience.setStartDate_exp(newStrDate);
        experience.setEndDate_exp(newEndDate);
        experience.setDescription_exp(newDesc);
        experience.setImg_exp(newImg);


        return experience;
    }

}
