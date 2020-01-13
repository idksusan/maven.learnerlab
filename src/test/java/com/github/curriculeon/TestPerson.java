package com.github.curriculeon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {
    //given
    private final long id = 38572749;
    final String name = "Sam";

    //when
    private Person person = new Person(id, name);

    @Test
    public void testConstructor(){

        //TODO: switch expected and actual
        assertEquals(person.getId(), id);
        assertEquals(person.getName(), name);
    }

    @Test
    public void testSetName(){
        assertEquals(person.getName(), name);
    }

}
