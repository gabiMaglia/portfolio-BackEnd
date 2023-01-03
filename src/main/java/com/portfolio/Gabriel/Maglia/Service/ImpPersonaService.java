package com.portfolio.Gabriel.Maglia.Service;

import com.portfolio.Gabriel.Maglia.Entity.Persona;
import com.portfolio.Gabriel.Maglia.Interface.IPersonaService;
import com.portfolio.Gabriel.Maglia.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired
    IPersonaRepository ipersonaRepository;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
         return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
}


