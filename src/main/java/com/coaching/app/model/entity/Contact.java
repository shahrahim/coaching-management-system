package com.coaching.app.model.entity;

import com.coaching.app.model.enums.ContactType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer personId;

    private ContactType type;

    private String info;

}
