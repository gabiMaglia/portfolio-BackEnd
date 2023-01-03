package com.portfolio.Gabriel.Maglia.Service;

import com.portfolio.Gabriel.Maglia.Entity.Persona;
import com.portfolio.Gabriel.Maglia.Entity.SocialMedia;
import com.portfolio.Gabriel.Maglia.Interface.ISocialMediaService;
import com.portfolio.Gabriel.Maglia.Repository.ISocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class impSocialMediaService implements ISocialMediaService {
    @Autowired
    ISocialMediaRepository iSocialMediaRepository;
    @Override
    public List<SocialMedia> getSocialMedia() {
        List<SocialMedia> socialMedia = iSocialMediaRepository.findAll();
        return socialMedia;
    }
    @Override
    public void saveSocialMedia(SocialMedia socialMedia) {
        iSocialMediaRepository.save(socialMedia);
    }

    @Override
    public SocialMedia findSocialMedia(Long id) {
        SocialMedia socialMedia = iSocialMediaRepository.findById(id).orElse(null);
        return socialMedia;
    }
}
