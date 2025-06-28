package com.pingwit_java_course.part23.homework.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetReverse {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 2, 4, 6)); // Arrays.asList() -> List.of и можно будет убрать TreeSet<Integer> numbers
        TreeSet<Integer> reversed = new TreeSet<>(Collections.reverseOrder()); // Просто для информации. Более часто используемая альтернатива Comparator.reverseOrder(), сути не меняет
        reversed.addAll(numbers);

        System.out.println("Reversed sorting: " + reversed);
    }
}
