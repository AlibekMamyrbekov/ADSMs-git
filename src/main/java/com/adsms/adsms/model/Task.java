package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @ManyToOne
    private TaskPrototype taskPrototype;
    @NotNull
    @ManyToOne
    private Event event;
    @NotNull
    private int taskProgress;

    public Task() {
    }

}
