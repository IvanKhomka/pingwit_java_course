package com.pingwit_java_course.part4;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 12;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        } while (i < 10);
    }
}