package com.coaching.app.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
public class Lesson {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer planId;

    private Integer trainingCenterId;

    private Integer studentId;

    private Integer coachId;

    private Date startTime;

    private Date endTime;

}
