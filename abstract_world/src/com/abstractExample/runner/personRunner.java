package com.abstractExample.runner;

import com.abstractExample.internal.Person;

public class personRunner {
    public static void main(String[] args) {
        Person person=new Person("Rahul") {
            @Override
            public void greet() {
                super.greet();
            }
        };
    }
}
