package com.portfolio.Gabriel.Maglia.Controller;


import com.portfolio.Gabriel.Maglia.Entity.Proyects;
import com.portfolio.Gabriel.Maglia.Interface.IProyectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Proyects> createProyects(@RequestBody Proyects proyects){
        proyectsService.saveProyect(proyects);
        return new ResponseEntity<>(proyects, HttpStatus.CREATED );
    }

    @DeleteMapping("/delete/pro/{id}")
    public ResponseEntity<?> deleteProyects(@PathVariable Long id){
        proyectsService.deleteProyect(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/edit/pro/{id}")
    public Proyects editProyects(@PathVariable ("id") Long id,
                                 @RequestBody Map<String, String> body)
                                     {
        Proyects proyects = proyectsService.findProyects(id);
        proyects.setTitle_pro(body.get("title_pro"));
        proyects.setTechnologies_pro(body.get("technologies_pro"));
        proyects.setDeployLink_pro(body.get("deployLink_pro"));
        proyects.setGithubLink_pro(body.get("githubLink_pro"));
        proyects.setDescription_pro(body.get("description_pro"));
        proyects.setImg1_pro(body.get("img1_pro"));
        proyects.setImg2_pro(body.get("img2_pro"));
        proyects.setImg3_pro(body.get("img3_pro"));

        proyectsService.saveProyect(proyects);


        return proyects;
    }
}
