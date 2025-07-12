package com.my_work.mapps.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner
{
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(22);
        arrayList.add(222);
        arrayList.add(2222);
        arrayList.add(22222);
        arrayList.add(222222);
        arrayList.add(222222);

        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(33);
        list.add(333);
        list.add(3333);
        list.add(33333);
        System.out.println(list);
        System.out.println(list.subList(2,5));
        System.out.println(list.spliterator());
}
}