package com.pingwit_java_course.part6.homework.task1;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner myScannerArray = new Scanner(System.in); // myScannerArray - не ошибка, но можно просто scanner
        int[] myIntArray = new int[5]; // myIntArray -> numbers
        for (int i = 0; i < myIntArray.length; i++) { // если поставишь абзац после 8ой строки, код будет приятнее читать
            System.out.println("Please, enter the number: ");
            myIntArray[i] = myScannerArray.nextInt();
        } // сюда предлагаю тоже абзац добавить как завершение логического блока
        int min = myIntArray[0];
        int max = myIntArray[0];
        int sum = 0;
        for (int j : myIntArray) { // j -> element, number
            sum += j;
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }

        System.out.println("The sum of numbers in your array = " + sum);
        System.out.println("The biggest number in your array = " + max);
        System.out.println("The minimal number in your array = " + min);
    }
}
