package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class EventPrototype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventprototype_id;
    @NotNull
    private int eventInterval;
    @NotNull
    private String eventname;


    public EventPrototype() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof EventPrototype;
    }

}
