package com.access;

public class Door  {
    private int doorNo;
    private String doorName;

    public Door() {
        System.out.println(" no-arg Constructor of Door");
    }

    public Door(String doorName, int doorNo){
        this.doorName=doorName;
        this.doorNo=doorNo;
        System.out.println("String, int Constructor of Door");
    }
    public Door(Door door){
        this.doorNo= door.doorNo;;
        this.doorName= door.doorName;
    }
    @Override
    public String toString(){
        return "Door No="+doorNo+" Door Name="+doorName;
    }

    public void open() {
        System.out.println("Opening the door manually");
    }
}
