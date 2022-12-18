package com.portfolio.Gabriel.Maglia.Repository;


import com.portfolio.Gabriel.Maglia.Entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISocialMediaRepository extends JpaRepository <SocialMedia, Long> {

}
