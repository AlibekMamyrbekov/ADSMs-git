package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @NotNull
    private String patientCode;
    @NotNull
    private Date dateOfBirthday;
    @NotNull
    private String initials;
    @NotNull
    private String patientSex;
    @NotNull
    private Boolean confirmed;
    @ManyToOne(cascade = CascadeType.ALL)
    @NotNull
    private Staff doctor;
    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    private Diagnosis patinent_diagnosis;
    @NotNull
    private String password;

    private String email;

    private String phoneNumber;

    public Patient() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof Patient;
    }

}
