package com.portfolio.Gabriel.Maglia.Auth.models;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Table(name="login")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private Integer persona_id;

    public Integer getPersona_id() {
        return 01;
    }

    public void setPersona_id(Integer persona_id) {
        this.persona_id = persona_id;
    }

    public Integer getPersona_DNI_persona() {
        return 32758971;
    }

    public void setPersona_DNI_persona(Integer persona_DNI_persona) {
        this.persona_DNI_persona = persona_DNI_persona;
    }

    @NotNull
    private Integer persona_DNI_persona;

    public User() {
    }

    public User(String email, String password) {

        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        System.out.println (password);
        return password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
