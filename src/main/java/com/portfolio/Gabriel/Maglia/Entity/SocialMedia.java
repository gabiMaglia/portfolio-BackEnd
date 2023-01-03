package com.portfolio.Gabriel.Maglia.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Getter @Setter
@Entity
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String facebook;


    private String gmail;


    private String instagram;


    private String linkedin;


    private String github;

    @NotNull
    private Long persona_id;

    @NotNull
    private Long persona_DNI_persona;
}


