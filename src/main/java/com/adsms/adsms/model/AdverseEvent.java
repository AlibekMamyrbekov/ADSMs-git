package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import java.time.LocalDate;

@Data
@Entity
public class AdverseEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String adverseName;
    @NotNull
    private java.time.LocalDate adverseDate;
    @NotNull
    private String adverseComment;
    @NotNull
    @Column(nullable = false)
    private Boolean adverseAlcohol;
    @NotNull
    @Column(nullable = false)
    private Boolean adverseDrug;
    @ManyToOne
    @NotNull
    private Staff staff;
    @ManyToOne
    @NotNull
    private Patient patient;
    @NotNull
    private String adverseStatus;

    public AdverseEvent() {

    }

}
