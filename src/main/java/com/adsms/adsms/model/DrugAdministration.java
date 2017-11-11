package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
public class DrugAdministration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    /*@JoinTable(name = "Drug", joinColumns = @JoinColumn(name = "drug_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))*/
    @NotNull
    private List<Receipt> receipt;
    @OneToOne
    @NotNull
    private Patient patient;
    @NotNull
    private String drugStatus;
    @NotNull
    private java.time.LocalDate drugAdministraionDate;

    public DrugAdministration() {
    }

}
