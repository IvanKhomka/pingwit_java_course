package com.pingwit_java_course.part6.homework.task2;

public class AverageArithmetic {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 7, 54, -254, 14};
        int sum = 0;
        for (int v : array) {
            sum += v;
        }
        if (array.length == 0) {
            System.out.println("Your array is empty.");
        } else {
            double average = sum / array.length;
            System.out.println("The average arithmetic of array = " + average);
        }
    }
}

