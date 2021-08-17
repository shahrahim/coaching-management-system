package com.coaching.app.model.entity;

import com.coaching.app.model.enums.Duration;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Membership {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer studentId;

    private Integer price;

    private Duration duration;

}
