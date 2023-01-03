package com.portfolio.Gabriel.Maglia.Interface;

import com.portfolio.Gabriel.Maglia.Entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Traer Persona
    public List<Persona> getPersona();

    //Guardar Objeto de tipo persona
    public void savePersona(Persona persona);

    //Buscar Persona por id
    public Persona findPersona(Long id);
}
