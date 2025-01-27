package com.pingwit_java_course.part4.homework.task5;

public class InchesConverter {
    public static void main(String[] args) {
        double INCH_IN_CM = 2.54; // INCH_IN_CM -> inchToCentimeterRate. Переменные в camelCase, константы класса будут капслоком и через _

        for (int i = 1; i <= 20; i++) {
            double result = i * INCH_IN_CM;
            System.out.println("Conversation of " + i + " inches to cm = " + result + " cm");
        }
    }
}
