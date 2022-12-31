package com.portfolio.Gabriel.Maglia.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Setter @Getter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String type;

    @NotNull
    private String img_skill;

    @NotNull
    private String name;

    @NotNull
    private Integer amount;

    @NotNull
    private Long persona_id;

    @NotNull
    private Long persona_DNI_persona;

}
