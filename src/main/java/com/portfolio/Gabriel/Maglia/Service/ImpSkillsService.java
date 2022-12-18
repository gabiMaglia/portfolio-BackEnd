package com.portfolio.Gabriel.Maglia.Service;

import com.portfolio.Gabriel.Maglia.Entity.Skills;
import com.portfolio.Gabriel.Maglia.Interface.ISkillsService;
import com.portfolio.Gabriel.Maglia.Repository.ISkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpSkillsService implements ISkillsService {
    @Autowired
    ISkillsRepository skillsRepo;

    @Override
    public List<Skills> getSkill() {
        List<Skills> skill = skillsRepo.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skills skill) {
        skillsRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills findSkills(Long id) {
        Skills skills = skillsRepo.findById(id).orElse(null);
        return skills;
    }
}
