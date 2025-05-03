package com.pingwit_java_course.part14.homework.task7;

public class StringsLength {
    public static void main(String[] args) {
        String[] strings = {"Ivan", "Aleksey", "Tatsiana", "Egor", "Anton", "Ilya", "Aleksander"};
        System.out.println("Strings longer than 5 symbols:");

        int hieroglyph = 5; // hieroglyph - а почему такое название переменной?

        for (String str : strings) {
            if (str.length() > hieroglyph) {
                System.out.println(str);
            }
        }
    }
}