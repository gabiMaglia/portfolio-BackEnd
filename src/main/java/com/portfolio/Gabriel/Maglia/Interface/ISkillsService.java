package com.portfolio.Gabriel.Maglia.Interface;



import com.portfolio.Gabriel.Maglia.Entity.Skills;

import java.util.List;

public interface ISkillsService {
    //Traer
    public List<Skills> getSkill();

    //Guardar Objeto
    public void saveSkill(Skills skill);

    //Eliminar
    public void deleteSkill(Long id);

    //Buscar
    public Skills findSkills(Long id);
}
