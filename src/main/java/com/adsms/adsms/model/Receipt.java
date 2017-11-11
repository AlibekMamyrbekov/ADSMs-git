package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @NotNull
    private Patient patient;
    @NotNull
    private float drugDoze;
    @NotNull
    private boolean receipt_status;
    @NotNull
    private java.time.LocalDate recieptDate;
    @NotNull
    @OneToOne
    private Drug drug;

    public Receipt() {
    }

}
