package com.xworkz.god.external;

import com.xworkz.god.internal.Forest;

public class Hiker {
    public  void  exploreForest(){
        System.out.println("running exploreForest in Hiker");
        Forest forest= new Forest();
        forest.explore();

    }
}
