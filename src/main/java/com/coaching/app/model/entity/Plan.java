package com.coaching.app.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Plan {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer accountHolderId;

    private String name;

    private Integer price;

    private Integer quantity;

    @OneToMany(mappedBy="planId", cascade = CascadeType.ALL)
    private Set<Lesson> lessons = new HashSet<>();


}
