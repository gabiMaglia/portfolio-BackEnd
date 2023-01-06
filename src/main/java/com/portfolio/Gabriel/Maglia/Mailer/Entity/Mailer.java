package com.portfolio.Gabriel.Maglia.Mailer.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter


public class Mailer {
    @NotNull
   private String name;
   private String surname;
    @NotNull

   private String email;
    @NotNull
   private String mensaje;
}
