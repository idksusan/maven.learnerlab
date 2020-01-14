package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class TestStudent {
    //given
    private final long id = 38572749;
    private final String name = "Sam";
    private double studyHours = 3.0;

    //when
    private Student student = new Student(id, name);

    @Test
    public void testImplementation(){
        Assert.assertThat(student, instanceOf(Learner.class));
    }

    @Test
    public void testInheritance(){
        Assert.assertThat(student, instanceOf(Person.class));
    }

    @Test
    public void testLearn(){
        student.learn(studyHours);
        //Assert.assertEquals(expectedHours, student.learn(studyHours));
    }
}
