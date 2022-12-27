package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Studies;
import com.portfolio.Gabriel.Maglia.Interface.IStudiesService;
import org.apache.tomcat.jni.Address;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class StudiesController {

    @Autowired
    IStudiesService studiesService;

    @GetMapping("/get/studies")
    public List<Studies> getStudies() {
        return studiesService.getStudies();
    }

    @PostMapping("/add/studies")
    public ResponseEntity<Studies> createStudie(@RequestBody Studies studie) {
        studiesService.saveStudies(studie);
        return  new ResponseEntity<>(studie, HttpStatus.CREATED);
    }

    @DeleteMapping ("/delete/studies/{id}")
    public ResponseEntity<?> deleteStudie ( @PathVariable Long id) {
        studiesService.deleteStudies(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping ("/edit/studies/{id}")
    public ResponseEntity<Studies> editStudie(@PathVariable("id") Long id,
                              @RequestBody Map<String, String> body){
        Studies studie = studiesService.findStudies(id);
        studie.setTitle_st(body.get("title_st"));
        studie.setInstitution_st(body.get("institution_st"));
        studie.setStartDate_st(body.get("startDate_st"));
        studie.setEndDate_st(body.get("endDate_st"));
        studie.setDescription_st(body.get("description_st"));
        studie.setImg_st(body.get("img_st"));
        studiesService.saveStudies(studie);
        return new ResponseEntity<>(studie, HttpStatus.OK);

    }




}

