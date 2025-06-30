package com.myworkz.queryhub.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionClass {
    public static void main(String[] args) {

        Collection<String> array1 =new ArrayList<>();
        array1.add("go to hell");
        array1.add("fall into deep sleep");
        array1.add("die");

        Collection<String> array2=new ArrayList<>();
        array2.add("die");
        array2.add("go to hell");
        array2.add("fall into deep sleep");

        if(array1.equals(array2)){//1
            System.out.println("contains same data");
        }
        else {
            System.out.println("does not contain same data");
        }

        boolean result= array1.containsAll(array2);//2
        System.out.println(result);

        System.out.println("============");

        array1.addAll(array2);//3
        for(String curse: array1){
            System.out.println(curse);
        }

        array1.removeAll(array2);//4
        for(String curse: array1){
            System.out.println(curse);
        }

        Iterator<String> iterator= array1.iterator();//5
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        result= array1.isEmpty();//6
        System.out.println(result);

        result= array1.contains("die");//7
        System.out.println(result);

        array1.clear();//8
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        array1.retainAll(array2);//9
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(array1.size()+" is the size");//10

        while(iterator.hasNext()){
            if(iterator.next().equals("die")){
                iterator.remove();//11
            }

        }

        array1.remove("go to hell");//12

        array1.stream().iterator();//13

        System.out.println("hashcode for array1: "+ array1.hashCode());//14

        Object[] newCurses=array2.toArray();
        System.out.println(newCurses);//15

    }
}