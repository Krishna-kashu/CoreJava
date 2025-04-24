package com.oopsworkz.other;

import com.oopsworkz.internal.Charger;

public class Socket {
    private Charger charger;

    public Socket(Charger charger){
        this.charger=charger;
        System.out.println("no arg const. of Socket");
    }
    public void SwitchOn(){
        System.out.println("Running SwitchOn in Socket");
        if(charger!=null){
          this.charger.charge();//this.charger.charge
        }
        else{
            System.out.println("charger object is null");
        }
    }

}
