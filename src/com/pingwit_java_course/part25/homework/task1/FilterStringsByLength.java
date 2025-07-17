package com.pingwit_java_course.part25.homework.task1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsByLength {
    public static void main(String[] args) {
        List<String> strings = List.of("cat", "elephant", "house", "sun", "planet");
        List<String> filtered = strings.stream()
                .filter(s -> s.length() >= 5) // магическое число
                .collect(Collectors.toList()); //.collect(Collectors.toList()) -> toList()
        System.out.println("Strings with length >= 5: " + filtered);
    }
}