package com.pingwit_java_course.part4.homework.task7;

public class oddNumbersSum {
    public static void main(String[] args) {

        int firstOddNumber;
        int sumOfOddNumbers = 0;

        for (firstOddNumber = 1; firstOddNumber <= 99; firstOddNumber++) {

            if (firstOddNumber % 2 != 0) {
                sumOfOddNumbers += firstOddNumber;
            }
        }
        System.out.println("Sum of odd numbers = " + sumOfOddNumbers);
    }
}
