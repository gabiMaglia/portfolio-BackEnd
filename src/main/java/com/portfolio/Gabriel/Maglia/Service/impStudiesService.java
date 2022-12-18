package com.portfolio.Gabriel.Maglia.Service;


import com.portfolio.Gabriel.Maglia.Entity.Studies;
import com.portfolio.Gabriel.Maglia.Interface.IStudiesService;
import com.portfolio.Gabriel.Maglia.Repository.IStudiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class impStudiesService implements IStudiesService {
    @Autowired
    IStudiesRepository studiesRepository;

    @Override
    public List<Studies> getStudies() {
        List<Studies> studies = studiesRepository.findAll();
        return studies;
    }

    @Override
    public void saveStudies(Studies studies) {
        studiesRepository.save(studies);
    }

    @Override
    public void deleteStudies(Long id) {
        studiesRepository.deleteById(id);
    }

    @Override
    public Studies findStudies(Long id) {
        Studies studies = studiesRepository.findById(id).orElse(null);
        return studies;
    }
}
