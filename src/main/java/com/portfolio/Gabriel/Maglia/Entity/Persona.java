package com.portfolio.Gabriel.Maglia.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String name_persona;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String surname_persona;

    @NotNull
    private Long dni_persona;

    @NotNull
    private Long telephone_persona;



    private String photo_url;

    @NotNull
    private String main_phrase;

    @NotNull
    private String phrase1;

    @NotNull
    private String phrase2;

    @NotNull
    private  String phrase3;

}
