package com.portfolio.Gabriel.Maglia.Interface;

import com.portfolio.Gabriel.Maglia.Entity.Experience;

import java.util.List;

public interface IExperienceService {
    //Traer Experience
    public List<Experience> getExperience();

    //Guardar Objeto de tipo Experience
    public void saveExperience(Experience experience);

    //Eliminar Experience
    public void deleteExperience(Long id);

    //Buscar Experience por id
    public Experience findExperience(Long id);
}
