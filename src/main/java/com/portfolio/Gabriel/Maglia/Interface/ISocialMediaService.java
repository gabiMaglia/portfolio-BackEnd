package com.portfolio.Gabriel.Maglia.Interface;

import com.portfolio.Gabriel.Maglia.Entity.SocialMedia;

import java.util.List;

public interface ISocialMediaService {
    //Traer
    public List<SocialMedia> getSocialMedia();

    //Guardar Objeto
    public void saveSocialMedia(SocialMedia socialMedia);


    //Buscar
    public SocialMedia findSocialMedia(Long id);
}
