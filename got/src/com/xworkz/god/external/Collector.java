package com.xworkz.god.external;

import com.xworkz.god.internal.Shell;

public class Collector {
    public  void pickShell(){
        System.out.println("pickShell running in Collector");
        Shell shell = new Shell();
        shell.listenSound();
    }
}
