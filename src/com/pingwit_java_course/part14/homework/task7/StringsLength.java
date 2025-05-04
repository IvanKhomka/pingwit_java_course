package com.pingwit_java_course.part14.homework.task7;

public class StringsLength {
    public static void main(String[] args) {
        String[] strings = {"Ivan", "Aleksey", "Tatsiana", "Egor", "Anton", "Ilya", "Aleksander"};
        System.out.println("Strings longer than 5 symbols:");

        //Когда называешь переменную, попробуй предположить что в ней может храниться? В переменной symbols я бы ожидал увидеть символы, например массив или строка через запятую. А тут = 5. Я бы удивился
        int symbols = 5; //  acceptableWordLength

        for (String str : strings) {
            if (str.length() > symbols) {
                System.out.println(str);
            }
        }
    }
}