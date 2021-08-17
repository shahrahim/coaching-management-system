package com.coaching.app.model.entity;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

public class BeanTest {

    @Test
    public void testAccountHolder() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(AccountHolder.class);
    }

    @Test
    public void testCoach() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Coach.class);
    }

    @Test
    public void testContact() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Contact.class);
    }

    @Test
    public void testLesson() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Lesson.class);
    }

    @Test
    public void testMembership() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Membership.class);
    }

    @Test
    public void testOwner() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Owner.class);
    }

    @Test
    public void testPerson() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Person.class);
    }

    @Test
    public void testPlan() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Plan.class);
    }

    @Test
    public void testStudent() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(Student.class);
    }

    @Test
    public void testTrainingCenter() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(TrainingCenter.class);
    }



}
