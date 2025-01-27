package com.pingwit_java_course.part4.homework.task7;

public class oddNumbersSum { // название класса должно быть с большой буквы
    public static void main(String[] args) {

        int firstOddNumber; // это удаляем
        int sumOfOddNumbers = 0;

        // когда к firstOddNumber ты прибавишь 1, то это уже не будет firstOddNumber, стоит придумать другое название
        for (firstOddNumber = 1; firstOddNumber <= 99; firstOddNumber++) { // firstOddNumber = 1; -> int firstOddNumber = 1;
// не критично, но это лишняя строка
            if (firstOddNumber % 2 != 0) {
                sumOfOddNumbers += firstOddNumber;
            }
        }
        System.out.println("Sum of odd numbers = " + sumOfOddNumbers);
    }
}
