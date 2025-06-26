package com.pingwit_java_course.part23.homework.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSetReverse {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 2, 4, 6));
        TreeSet<Integer> reversed = new TreeSet<>(Collections.reverseOrder());
        reversed.addAll(numbers);

        System.out.println("Reversed sorting: " + reversed);
    }
}
