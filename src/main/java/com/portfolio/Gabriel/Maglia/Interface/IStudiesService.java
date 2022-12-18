package com.portfolio.Gabriel.Maglia.Interface;

import com.portfolio.Gabriel.Maglia.Entity.Studies;

import java.util.List;

public interface IStudiesService {
    //Traer
    public List<Studies> getStudies();

    //Guardar Objeto
    public void saveStudies(Studies studies);

    //Eliminar
    public void deleteStudies(Long id);

    //Buscar
    public Studies findStudies(Long id);
}
