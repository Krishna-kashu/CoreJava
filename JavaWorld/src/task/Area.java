package task;

import java.sql.SQLOutput;

public class Area {
    String zone;
    String noiceLevel;

    public Area(String zone,String noiceLevel){
        this.noiceLevel=noiceLevel;
        this.zone=zone;
    }
    public void info(){
        System.out.println("zone :"+ zone);
        System.out.println("noiceLevel :"+ noiceLevel);
    }
}