package com.pingwit_java_course.part6.homework.task5;

import java.util.Arrays;

public class ArrayInversion {
    public static void main(String[] args) {
        int[] array = {6, 9, 8, 7};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
