package com.portfolio.Gabriel.Maglia.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter @Getter
@Entity

public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title_exp;

    @NotNull
    private String institution_exp;


    private Boolean isActualJob_exp;

    @NotNull
    private String startDate_exp;


    private String endDate_exp;

    @NotNull
    private String description_exp;


    private String img_exp;

    @NotNull
    private Long persona_id;

    @NotNull
    private Long persona_DNI_persona;



}
