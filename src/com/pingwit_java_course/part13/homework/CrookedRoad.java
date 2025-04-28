package com.pingwit_java_course.part13.homework;

import java.util.Scanner;

public class CrookedRoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose travel time in seconds, please: ");
        int seconds = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        long endTime = startTime + seconds * 1000L;

        int position = 0;
        int direction = 1; // это не ошибка, просто в данном случае тип переменной может быть boolean и меняешь направление через true/false
        int maxOffset = 8;

        while (true) { // обращай внимание, когда idea подчеркивает что-нибудь. Очень часто хорошие подсказки
            if (System.currentTimeMillis() >= endTime) { // и финальный штрих - немного измени этот if и подставь вместо (true)
                break;
            }

            for (int i = 0; i < position; i++) {
                System.out.print(" ");
            }
            System.out.println("|| | ||");

            position += direction;
            if (position == 0 || position == maxOffset) {
                direction *= -1;
            }
        }
    }
}