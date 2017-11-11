package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class TaskPrototype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long taskprototype_id;
    @NotNull
    private String taskDescription;
    @NotNull
    private String name;
    @NotNull
    public TaskPrototype() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof TaskPrototype;
    }

}
