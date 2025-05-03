package com.pingwit_java_course.part14.homework.task7;

public class StringsLength {
    public static void main(String[] args) {
        String[] strings = {"Ivan", "Aleksey", "Tatsiana", "Egor", "Anton", "Ilya", "Aleksander"};
        System.out.println("Strings longer than 5 symbols:");

        int symbols = 5;

        for (String str : strings) {
            if (str.length() > symbols) {
                System.out.println(str);
            }
        }
    }
}