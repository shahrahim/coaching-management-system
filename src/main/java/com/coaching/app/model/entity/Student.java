package com.coaching.app.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Student extends Person {

    private Integer accountHolderId;

    private Integer membershipId;

    @OneToMany(mappedBy="studentId")
    private Set<Lesson> lessons = new HashSet<>();


}
