package com.pingwit_java_course.part21.homework.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListDeleteFromMiddle {
    public static void main(String[] args) {
        int size = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        List<Integer> arrayListCopy = new ArrayList<>(arrayList);
        long start = System.currentTimeMillis();
        while (!arrayListCopy.isEmpty()) {
            arrayListCopy.remove(arrayListCopy.size() / 2);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList removing from the middle: " + (end - start) + " ms");

        List<Integer> linkedListCopy = new LinkedList<>(linkedList);
        start = System.currentTimeMillis();
        while (!linkedListCopy.isEmpty()) {
            linkedListCopy.remove(linkedListCopy.size() / 2);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList removing from the middle: " + (end - start) + " ms");
    }
}