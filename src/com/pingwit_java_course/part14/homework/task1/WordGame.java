package com.pingwit_java_course.part14.homework.task1;

public class WordGame {
    public static void main(String[] args) {
        String word = "engineering "; // лишний пробел в конце
        String engine = word.substring(0, 6);
        String ring = word.substring(7);
        System.out.println("First word: " + engine); // привет от Егорки
        System.out.println("Second word: " + ring);
    }
}