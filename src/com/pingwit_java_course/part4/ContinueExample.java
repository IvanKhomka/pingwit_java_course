package com.pingwit_java_course.part4;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("Happy End");
    }
}
