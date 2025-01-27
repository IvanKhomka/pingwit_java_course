package com.pingwit_java_course.part4.homework.task9;

public class TriangleToRhombus {
    public static void main(String[] args) {
/*
1. Цифра 4 повторяется во всех циклах, это хороший кандидат на переменную int size = 4;
Тогда можно регулировать размер в 1 месте и не страдать

2. Попробуй решить задачу, используя только 2 цикла, т.е. будет

        for (int i = 0; i < *; i++) {
            for (int j = 0; j < *; j++) {
                // logic
            }
        }
 */

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
