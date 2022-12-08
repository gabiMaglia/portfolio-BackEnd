package com.portfolio.Gabriel.Maglia.Controller;

import com.portfolio.Gabriel.Maglia.Entity.Persona;
import com.portfolio.Gabriel.Maglia.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class PersonaController {
    @Autowired
    IPersonaService ipersonaservice;
    @GetMapping("/persona/traer/perfil")
    public List<Persona> getPersona () {
        return ipersonaservice.getPersona();
    }
    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        return "La persona fue creada satisfactoriamente";
    }
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
            ipersonaservice.deletePersona(id);
        return "La Persona fue eliminada correctamente";
    }
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("name_persona") String newNombre,
                               @RequestParam("surname_persona") String newApellido,
                               @RequestParam("dni_persona")Long newDni,
                               @RequestParam("telephone_persona") Long newTelephone,
                               @RequestParam("photo_url") String newImg) {
        Persona persona = ipersonaservice.findPersona(id);
        persona.setName_persona(newNombre);
        persona.setSurname_persona(newApellido);
        persona.setDni_persona(newDni);
        persona.setTelephone_persona(newTelephone);
        persona.setPhoto_url(newImg);
        ipersonaservice.savePersona(persona);
        return persona;
    }


}
