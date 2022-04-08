package com.ema.tp2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
@Table(name = "uzer")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    @NotEmpty
    @NotBlank
    private String nom;

    @NotEmpty
    @NotBlank
    private String prenom;
}
