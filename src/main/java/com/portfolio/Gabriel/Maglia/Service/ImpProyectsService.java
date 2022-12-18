package com.portfolio.Gabriel.Maglia.Service;


import com.portfolio.Gabriel.Maglia.Entity.Proyects;
import com.portfolio.Gabriel.Maglia.Interface.IProyectsService;
import com.portfolio.Gabriel.Maglia.Repository.IProyectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpProyectsService implements IProyectsService {
    @Autowired
    IProyectsRepository proyectsRepository;

    @Override
    public List<Proyects> getProyect() {
        List<Proyects> proyects = proyectsRepository.findAll();
        return proyects;
    }

    @Override
    public void saveProyect(Proyects proyects) {
        proyectsRepository.save(proyects);
    }

    @Override
    public void deleteProyect(Long id) {
        proyectsRepository.deleteById(id);
    }

    @Override
    public Proyects findProyects(Long id) {
        Proyects proyects = proyectsRepository.findById(id).orElse(null);
        return proyects;
    }
}
