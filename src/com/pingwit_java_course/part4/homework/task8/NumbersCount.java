package com.pingwit_java_course.part4.homework.task8;

public class NumbersCount {
    public static void main(String[] args) {
        int numbersQuantity; // удаляем
        int oddNumbersSum = 0;
        int evenNumbersSum = 0;
        int totalNumbersSum = 0;

        for (numbersQuantity = 0; numbersQuantity <= 100; numbersQuantity++) { // numbersQuantity = 0; -> int numbersQuantity = 0;
            if (numbersQuantity % 2 == 0) {
                oddNumbersSum += numbersQuantity;
            } else if (numbersQuantity % 2 != 0) { // число может быть четным и нечетным, соот-но if (numbersQuantity % 2 != 0) можно удалить и оставить только else
                evenNumbersSum += numbersQuantity;
            }
            totalNumbersSum += numbersQuantity;
        }
        System.out.println("Number of odd numbers: " + oddNumbersSum);
        System.out.println("Number of even numbers: " + evenNumbersSum);
        System.out.println("Total numbers sum: " + totalNumbersSum);
    }
}
