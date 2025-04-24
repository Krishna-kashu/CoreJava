package com.oopsworkz.runner;

import com.oopsworkz.impl.ACRemote;
import com.oopsworkz.impl.TVRemote;
import com.oopsworkz.internal.Remote;
import com.oopsworkz.other.SmartHome;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote =new TVRemote();
        remote.off();

        Remote remote1=new ACRemote();
        remote1.off();

        SmartHome smartHome= new SmartHome(remote);
        smartHome.on();
        SmartHome smartHome1 = new SmartHome(remote1);
        smartHome1.on();
    }
}
