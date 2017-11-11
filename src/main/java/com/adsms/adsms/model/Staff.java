package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String password;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    @NotNull
    private boolean activity_status;
    @NotNull
    private String role;
    @NotNull
    private boolean delete_status;
    @NotNull
    private String location;
    public Staff() {
    }

}
