package com.portfolio.Gabriel.Maglia.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@Entity

public class Proyects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title_pro;

    @NotNull
    private  String technologies_pro;

    @NotNull
    private  String description_pro;

    @NotNull
    private  String deployLink_pro;

    @NotNull
    private  String githubLink_pro;

    @NotNull
    private  String img1_pro;


    private  String img2_pro;


    private  String img3_pro;

    @NotNull
    private Long persona_id;

    @NotNull
    private Long persona_DNI_persona;



}
