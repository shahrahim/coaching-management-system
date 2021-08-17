package com.coaching.app.model.entity;

import com.coaching.app.model.enums.SportType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer ownerId;

    @OneToMany(mappedBy="trainingCenterId")
    private Set<Coach> coaches = new HashSet<>();

    @OneToMany(mappedBy="trainingCenterId")
    private Set<Lesson> lessons = new HashSet<>();

    @ElementCollection
    private Set<SportType> sports = new HashSet<>();

    private String name;

    private String address;

    private String city;

    private String state;

    private String zipcode;

    private String country;

    private String squareFootage;

    private String floors;

}
