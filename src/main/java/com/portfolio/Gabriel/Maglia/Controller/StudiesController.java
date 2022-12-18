package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Studies;
import com.portfolio.Gabriel.Maglia.Interface.IStudiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class StudiesController {

    @Autowired
    IStudiesService studiesService;

    @GetMapping("/studies/traer")
    public List<Studies> getStudies() {
        return studiesService.getStudies();
    }

    @PostMapping("/studies/crear")
    public String createStudie(@RequestBody Studies studie) {
        studiesService.saveStudies(studie);
        return "El estudio fue creado satisfactoriamente";
    }

    @DeleteMapping ("/studies/borrar/{id}")
    public String deleteStudie ( @PathVariable Long id) {
        studiesService.deleteStudies(id);
        return "El estudio fue eliminado correctamente";
    }

    @PutMapping ("/studies/editar/{id}")
    public Studies editStudie(@PathVariable Long id,
                              @RequestParam ("title_st") String newTitle,
                              @RequestParam ("institution_st") String newInst ,
                              @RequestParam ("startDate_st") String newStrDate ,
                              @RequestParam ("endDate_st") String newEndDate ,
                              @RequestParam ("description_st") String newDesc ,
                              @RequestParam ("img_st") String newImg ) {
        Studies studies = studiesService.findStudies(id);
        studies.setTitle_st(newTitle);
        studies.setInstitution_st(newInst);
        studies.setStartDate_st(newStrDate);
        studies.setEndDate_st(newEndDate);
        studies.setDescription_st(newDesc);
        studies.setImg_st(newImg);

        return studies;

    }




}

