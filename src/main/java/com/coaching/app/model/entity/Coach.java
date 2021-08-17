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
public class Coach extends Person {

    private Integer hourlyRate;

    private Integer hoursPerWeek;

    private Integer trainingCenterId;

    @OneToMany(mappedBy="coachId")
    private Set<Lesson> lessons = new HashSet<>();


}
