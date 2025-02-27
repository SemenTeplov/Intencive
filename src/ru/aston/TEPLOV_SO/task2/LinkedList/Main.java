package ru.aston.TEPLOV_SO.task2.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(8);

        list.add(4);
        list.add(3);
        list.add(11);

        System.out.println("count: " + list.count());
        System.out.println("objects: " + list.toString());
        System.out.println("object: " + list.get(2));

        list.remove(2);

        System.out.println("objects: " + list.toString());

        list.clean();

        System.out.println("objects: " + list.toString());

        list.add(new Integer[] {4, 6, 9, 12});

        System.out.println("objects: " + list.toString());

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(9);

        list.add(arrayList);

        System.out.println("objects: " + list.toString());

        list.insert(23, 4);
        list.insert(50, 0);
        list.insert(50, list.count() - 1);

        System.out.println("objects: " + list.toString());
    }
}