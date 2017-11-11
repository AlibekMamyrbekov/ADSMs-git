package com.adsms.adsms.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
public class Protocol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    @NotNull
    private List<TaskPrototype> taskPrototype;

    public Protocol() {
    }

}
