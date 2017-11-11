package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long diagnosisId;
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
    public Diagnosis() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof Diagnosis;
    }

}
