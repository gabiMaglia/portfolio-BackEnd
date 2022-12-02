package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Persona;
import com.portfolio.Gabriel.Maglia.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    IPersonaService ipersonaservice;
    @GetMapping("personas/traer")
    public List<Persona> getPersona () {
        return ipersonaservice.getPersona();
    }
    @PostMapping("persona/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        return "La persona fue creada satisfactoriamente";
    }


}
