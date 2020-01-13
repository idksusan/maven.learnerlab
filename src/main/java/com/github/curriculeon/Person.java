package com.github.curriculeon;

public class Person {
    final long id;
    private String name;

    public Person(){
        this.id = 0;
        this.name = "";
    }

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
