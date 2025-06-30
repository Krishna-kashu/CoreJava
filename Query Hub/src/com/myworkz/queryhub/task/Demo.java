package com.myworkz.queryhub.task;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] numArray = new int[]{10, 6, 8, 3, 4, 9, 0, 2, 5, 1, 7};

        for (int i : numArray) {
            System.out.println(i);
        }
        System.out.println("after sorting");
        Arrays.sort(numArray);//1
        for (int i : numArray) {
            System.out.println(i);
        }

        System.out.println("==========");

        long[] phoneNumbers = new long[]{7483420737L, 97398257715L, 9740126919L, 8971491121L, 8970910517l};
        for (long i : phoneNumbers) {
            System.out.println(i);
        }
        Arrays.sort(phoneNumbers, 1, 3);//2
        System.out.println("After sorting");
        for (long i : phoneNumbers) {
            System.out.println(i);
        }

        System.out.println("========================");

        char[] letters = new char[]{'s', 'o', 'n', 'a', 'l', 'a', 'h', 'c', 'r', 'y', 'c'};
        System.out.println("parallel sort");
        Arrays.parallelSort(letters);//3
        for (long i : letters) {
            System.out.println(i);
        }
        System.out.println("parallel sort with range");
        Arrays.parallelSort(letters, 3, 7);//4
        for (long i : letters) {
            System.out.println(i);
        }

        System.out.println("================");
        System.out.println("binary search in numArray");
        System.out.println(Arrays.binarySearch(numArray, 7));//5

        System.out.println("binary search in letters with range");
        System.out.println(Arrays.binarySearch(letters, 2, 10, 'a'));//6

        long[] contactNumbers = Arrays.copyOf(phoneNumbers, 6);//7
        for (long i : contactNumbers) {
            System.out.print(" " + i);
        }

        int[] numbers = Arrays.copyOfRange(numArray, 2, 6);//8

        boolean equal = Arrays.equals(numbers, numArray);//9

        int[] zeroes = new int[10];
        Arrays.fill(zeroes, 0);//10

       System.out.println("\n\nhashcode"+Arrays.hashCode(numArray));//11

        System.out.println(Arrays.stream(numbers));//12

        System.out.println(Arrays.toString(numArray));//13

        System.out.println(Arrays.spliterator(numbers));//14
    }
}
