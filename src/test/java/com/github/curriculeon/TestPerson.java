package com.github.curriculeon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {
    final long id = 38572749;
    final String name = "Sam";
    private Person person = new Person(id, name);

    @Test
    public void testConstructor(){
        assertEquals(person.getId(), id);
        assertEquals(person.getName(), name);
    }

}
