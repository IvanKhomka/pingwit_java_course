package com.pingwit_java_course.part6.homework.task7;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {7, 14, 32, -8, 982, 8, 2150, -99, 86};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // j + 1 -> можно вынести в переменную
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
