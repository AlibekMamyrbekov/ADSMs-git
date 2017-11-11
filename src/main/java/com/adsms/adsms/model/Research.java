package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class Research {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private static final double PERCENT = 100.0;

    @NotNull
    private java.time.LocalDate enrollmentDate;

    @NotNull
    private java.time.LocalDate activationDate;

    @NotNull
    private Boolean activationStatus;

    @NotNull
    private double researchProgress;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Patient patient;

    public Research() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof Research;
    }

}
