package com.pingwit_java_course.part6.homework.task6;

import java.util.Arrays;

public class ArrayEvenConvert {
    public static void main(String[] args) {
        int[] array = {3, 16, 8, 73, 81, 22, 58, 98, 896};
        int[] evenNumbersTempArray = new int[array.length];
        int evenNumbersCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersTempArray[i] = array[i];
                evenNumbersCounter++;
            }
        }
        int[] evenNumbersFinalArray = new int[evenNumbersCounter];
        int index = 0;
        for (int i : evenNumbersTempArray) { // обычно в цикле foreach не используют переменные вроде i,j,k. elem - будет хорошим вариантом
            if (i != 0) {
                evenNumbersFinalArray[index] = i;
                index++;
            }
        }
        System.out.println(evenNumbersCounter);
        System.out.println(Arrays.toString(evenNumbersFinalArray));
    }
}
