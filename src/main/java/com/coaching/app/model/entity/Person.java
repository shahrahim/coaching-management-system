package com.coaching.app.model.entity;

import com.coaching.app.model.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String firstName;

    private String middleName;

    @NotNull
    private String lastName;

    private Integer age;

    private Gender gender;

    private String height;

    @OneToMany(mappedBy="personId", cascade = CascadeType.ALL)
    private Set<Contact> contacts = new HashSet<>();

}
