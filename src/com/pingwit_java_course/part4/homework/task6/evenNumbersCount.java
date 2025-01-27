package com.pingwit_java_course.part4.homework.task6;

public class evenNumbersCount { // название класса должно быть с большой буквы
    public static void main(String[] args) {
// не критично, но это лишняя строка
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
