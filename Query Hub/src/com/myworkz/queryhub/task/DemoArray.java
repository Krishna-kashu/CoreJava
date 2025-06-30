package com.myworkz.queryhub.task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        Arrays arrays;
        int[] numArray={1,2,3,4,5,6,8,7,9,10};

        int size= Array.getLength(numArray);
        System.out.println("size of array: "+size);
        System.out.println("====================");

        Object element=Array.get(numArray,3);
        System.out.println("element: "+element);
        System.out.println("====================");

        boolean booleanResult=Array.getBoolean(new boolean[]{true, false},1);
        System.out.println("boolean Result: "+booleanResult);
        System.out.println("=================");

        byte byteValue=Array.getByte(new byte[]{1,2,3,4,5,6,7,8},3);
        System.out.println("byte Value: "+byteValue);
        System.out.println("=====================");

        char charValue=Array.getChar(new char[]{'a','b','c','d','e','f'},3);
        System.out.println("charValue: "+charValue);
        System.out.println("=====================");

        short shortValue=Array.getShort(new short[]{12,23,34,45,56,78,89,90},3);
        System.out.println("shortValue: "+shortValue);
        System.out.println("=====================");

        int intValue=Array.getInt(numArray,3);
        System.out.println("intValue: "+intValue);
        System.out.println("=====================");

        double doubleValue=Array.getDouble(new double[]{1.0,2.99,3.66,4.58},3);
        System.out.println("doubleValue: "+doubleValue);
        System.out.println("=====================");

        float floatValue=Array.getFloat(new float[]{1.99f,2.88f,3.77f,4.66f,5.55f},3);
        System.out.println("floatValue: "+floatValue);
        System.out.println("=====================");

        long[] phoneNumbers=new long[]{7483420737L,97398257715L,9740126919L,8971491121L,8970910517l};
        long longValue=Array.getLong(phoneNumbers,3);
        System.out.println("longValue: "+longValue);
        System.out.println("=====================");

    }
}