package com.xworkz.god.internal;

public class Tree
{
    public void grow(){
        System.out.println("running grow in Tree");
        Forest forest= new Forest();
        forest.growTrees();
        forest.explore();
    }
}
