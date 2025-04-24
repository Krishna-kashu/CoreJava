package com.oopsworkz.other;

import com.oopsworkz.internal.Session;

public class Student {
    private Session session;

    public Student(Session session){
        this.session=session;
    }
    public void start(){
        System.out.println("Running Session in Student");
        if(session!=null){
            this.session.attend();
        }else{
            System.out.println("session is not there(null object)");
        }
    }
}
