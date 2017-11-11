package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Diagnosys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String riskFactor;
    @NotNull
    private String localizationDisease;
    @NotNull
    private String prevalence;
    @NotNull
    private String clinicalForm;
    @NotNull
    private String mbtStatus;
    @NotNull
    private String patientType;
    @NotNull
    private String dstStatus;


    @NotNull
    public Diagnosys() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof Diagnosys;
    }

}
