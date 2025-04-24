package com.oopsworkz.runner;

import com.oopsworkz.impl.OfflineSession;
import com.oopsworkz.impl.OnlineSession;
import com.oopsworkz.internal.Session;
import com.oopsworkz.other.Student;

public class SessionRunner {
    public static void main(String[] args) {
        Session session=new OfflineSession();
        session.attend();

        Session session1=new OnlineSession();
        session1.attend();

        Student student= new Student(session);
        student.start();
        Student student1 = new Student(session1);
        student1.start();
    }
}
