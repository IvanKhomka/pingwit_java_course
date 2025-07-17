package com.pingwit_java_course.part25.homework.task3;

import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 18, 21, 23, 30, 12);
        Optional<Integer> result = numbers.stream()
                .filter(n -> n > 22) // это магическое число
                .findFirst();
        System.out.println(result);
    }
}