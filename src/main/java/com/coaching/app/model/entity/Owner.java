package com.coaching.app.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Owner extends Person {

    @OneToMany(mappedBy = "ownerId")
    private Set<TrainingCenter> trainingCenters = new HashSet<>();

}
