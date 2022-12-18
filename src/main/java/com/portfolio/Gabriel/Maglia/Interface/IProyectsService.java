package com.portfolio.Gabriel.Maglia.Interface;


import com.portfolio.Gabriel.Maglia.Entity.Proyects;

import java.util.List;

public interface IProyectsService {
    //Traer
    public List<Proyects> getProyect();

    //Guardar Objeto
    public void saveProyect(Proyects proyects);

    //Eliminar
    public void deleteProyect(Long id);

    //Buscar
    public Proyects findProyects(Long id);
}
