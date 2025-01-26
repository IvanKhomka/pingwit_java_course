package com.pingwit_java_course.part4.homework.task9;

public class TriangleToRhombus {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int k = 2; k >= 4 - i; k--) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
