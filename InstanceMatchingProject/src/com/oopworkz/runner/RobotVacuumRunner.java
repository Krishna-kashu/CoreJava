package com.oopworkz.runner;
import com.oopworkz.constructor.RobotVacuum;
import com.oopworkz.setter.SmartPhone;

public class RobotVacuumRunner {
    public static void main(String[] args) {

        RobotVacuum rv1 = new RobotVacuum(120, "High", true, "iRobot");
        RobotVacuum rv2 = new RobotVacuum(90, "Medium", false, "Eufy");
        RobotVacuum rv3 = new RobotVacuum(90, "Medium", false, "Eufy");

        System.out.println("RobotVacuum 1: " + rv1);
        System.out.println("RobotVacuum 2: " + rv2);
        System.out.println("RobotVacuum 3: " + rv3);

        boolean rvMatch = rv2.equals(rv3);
        boolean rvNotMatch = rv1.equals(rv2);
        System.out.println("RobotVacuum match: " + rvMatch);
        System.out.println("RobotVacuum not match: " + rvNotMatch);
    }

    public static class SmartPhoneRunner {
        public static void main(String[] args) {

            SmartPhone s1 = new SmartPhone();
            s1.setBrand("Apple");
            s1.setStorage(128);
            s1.set5GEnabled(true);
            s1.setPrice(999);

            SmartPhone s2 = new SmartPhone();
            s2.setBrand("Samsung");
            s2.setStorage(64);
            s2.set5GEnabled(true);
            s2.setPrice(799);

            SmartPhone s3 = new SmartPhone();
            s3.setBrand("Samsung");
            s3.setStorage(64);
            s3.set5GEnabled(true);
            s3.setPrice(799);

            System.out.println("SmartPhone 1: " + s1);
            System.out.println("SmartPhone 2: " + s2);
            System.out.println("SmartPhone 3: " + s3);

            boolean sMatch = s2.equals(s3);
            boolean sNotMatch = s1.equals(s2);
            System.out.println("SmartPhone match: " + sMatch);
            System.out.println("SmartPhone not match: " + sNotMatch);
        }
    }
}
