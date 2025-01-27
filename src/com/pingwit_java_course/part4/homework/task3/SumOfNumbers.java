package com.pingwit_java_course.part4.homework.task3;

public class SumOfNumbers {
    public static void main(String[] args) {
        int firstNumber; // эту удаляем
        int totalSum = 1;

        for (firstNumber = 2; firstNumber <= 256; firstNumber++) { // firstNumber = 2; -> int firstNumber = 2;

            if (firstNumber % 2 == 0) {
                totalSum += firstNumber;
            }
        }
        System.out.println("Total sum is " + totalSum );
    }
}
