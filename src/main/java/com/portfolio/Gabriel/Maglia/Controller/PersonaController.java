package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Persona;
import com.portfolio.Gabriel.Maglia.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class PersonaController {
    @Autowired
    IPersonaService ipersonaservice;
    @GetMapping("/get/persona")
    public List<Persona> getPersona () {
        return ipersonaservice.getPersona();
    }

    @PutMapping("/edit/persona/{id}")

    public Persona editPersona(@PathVariable Long id,
                               @RequestBody Map<String, String> body) {
        System.out.println("llegaa");

        Persona persona = ipersonaservice.findPersona(id);

        persona.setName_persona(body.get("name_persona"));
        persona.setSurname_persona(body.get("surname_persona"));
        persona.setDni_persona(Long.valueOf(body.get("dni_persona")));
        persona.setTelephone_persona(Long.valueOf(body.get("telephone_persona")));
        persona.setPhoto_url(body.get("photo_url"));
        persona.setMain_phrase(body.get("main_phrase"));
        persona.setPhrase1(body.get("phrase1"));
        persona.setPhrase2(body.get("phrase2"));
        persona.setPhrase3(body.get("phrase3"));

        ipersonaservice.savePersona(persona);
        return persona;
    }


}
