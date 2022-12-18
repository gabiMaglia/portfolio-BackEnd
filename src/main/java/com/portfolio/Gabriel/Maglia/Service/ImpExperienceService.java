package com.portfolio.Gabriel.Maglia.Service;

import com.portfolio.Gabriel.Maglia.Entity.Experience;
import com.portfolio.Gabriel.Maglia.Interface.IExperienceService;
import com.portfolio.Gabriel.Maglia.Repository.IExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpExperienceService implements IExperienceService {

    @Autowired
    IExperienceRepository experienceRepository;

    @Override
    public List<Experience> getExperience() {
        List<Experience> experiences = experienceRepository.findAll();
        return experiences;
    }

    @Override
    public void saveExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        Experience experience = experienceRepository.findById(id).orElse(null);
        return experience;
    }
}
