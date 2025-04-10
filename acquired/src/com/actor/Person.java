package com.actor;

public class Person extends Human {
    public Person() {
        System.out.println("no-arg constructor of Person");
    }

    public void express() {
        System.out.println("Running express in Person");

        Human human1 = new Human();
        Human human2 = new Person();

        Person person1 = new Person();
    }
}
