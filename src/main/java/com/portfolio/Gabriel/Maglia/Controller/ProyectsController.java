package com.portfolio.Gabriel.Maglia.Controller;


import com.portfolio.Gabriel.Maglia.Entity.Proyects;
import com.portfolio.Gabriel.Maglia.Interface.IProyectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class ProyectsController {

    @Autowired
    IProyectsService proyectsService;

    @GetMapping("/get/pro")
    public List<Proyects> getProyects () {
        return proyectsService.getProyect();
    }

    @PostMapping("/add/pro")
    public String createProyects(@RequestBody Proyects proyects){
        proyectsService.saveProyect(proyects);
        return "La Proyects fue creada satisfactoriamente";
    }

    @DeleteMapping("/delete/pro/{id}")
    public String deleteProyects(@PathVariable Long id){
        proyectsService.deleteProyect(id);
        return "La Proyects fue eliminada correctamente";
    }

    @PutMapping("/edit/pro/{id}")
    public Proyects editProyects(@PathVariable Long id,
                                     @RequestParam ("title_pro") String newTitle,
                                     @RequestParam ("technologies_pro") String newTech ,
                                     @RequestParam ("deployLink_pro") String newDply,
                                     @RequestParam ("githubLink_pro") String newGthb ,
                                     @RequestParam ("img1_pro") String newImg1 ,
                                     @RequestParam ("img2_pro") String newImg2 ,
                                     @RequestParam ("img3_pro") String newImg3 ,
                                     @RequestParam ("description_pro") String newDesc)
                                     {
        Proyects proyects = proyectsService.findProyects(id);
        proyects.setTitle_pro(newTitle);
        proyects.setTechnologies_pro(newTech);
        proyects.setDeployLink_pro(newDply);
        proyects.setGithubLink_pro(newGthb);
        proyects.setDescription_pro(newDesc);
        proyects.setImg1_pro(newImg1);
        proyects.setImg2_pro(newImg2);
        proyects.setImg3_pro(newImg3);


        return proyects;
    }
}
