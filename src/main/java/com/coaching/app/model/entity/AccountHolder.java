package com.coaching.app.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class AccountHolder extends Person {

    @OneToMany(mappedBy="accountHolderId", cascade = CascadeType.ALL)
    private Set<Student> managedStudents = new HashSet<>();

    @OneToMany(mappedBy="accountHolderId", cascade = CascadeType.ALL)
    private Set<Plan> plans = new HashSet<>();


}
