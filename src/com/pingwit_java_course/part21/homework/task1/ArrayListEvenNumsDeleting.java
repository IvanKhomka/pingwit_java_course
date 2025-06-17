package com.pingwit_java_course.part21.homework.task1;

import java.util.ArrayList;

public class ArrayListEvenNumsDeleting { // Nums -> Numbers
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }

        System.out.println("List after adding elements: "); // здесь пробел в конце лишний
        System.out.println(list);

        list.removeIf(n -> n % 2 == 0);

        System.out.println("List after removing even elements: ");// здесь пробел в конце лишний
        System.out.println(list);
    }
}