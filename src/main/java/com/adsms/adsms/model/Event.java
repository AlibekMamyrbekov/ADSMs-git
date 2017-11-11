package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private java.time.LocalDate eventDate;
    private double eventProgress;
    @ManyToOne
    @NotNull
    private Research research;
    @ManyToOne
    @NotNull
    private EventPrototype event_prot_id;
    @OneToMany
    @JoinTable(name = "EventPrototype", joinColumns = @JoinColumn(name = "eventprototype_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
    @NotNull
    private List<EventPrototype> eventPrototype;
    // private List<String> tasksName;
    // private List<Integer> taskProgress;
    // @OneToMany
    // private List<Integer> taskId;

    public Event() {
    }

}
