package com.pingwit_java_course.part18.homework.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumsToFile { // Старайся избегать необоснованных сокращений вроде Num, Numbers - это добро :)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add: ");
        int numbersQuantity = scanner.nextInt();
        System.out.println("Enter numbers you want to write to file: ");
        int[] numbers = new int[numbersQuantity];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        try (FileWriter writer = new FileWriter("Numbers.txt")) {
            for (int number : numbers) {
                writer.write(number + " ");
            }
            // у тебя здесь сообщение с названием файла. Тогда стоит Numbers.txt вынести в переменную. Очень простое правило - менять только в 1 месте, чтобы рано или поздно не было Numbers.txt здесь, а на самом деле файл называется по-другому
            System.out.println("Numbers written to file Numbers.txt");
        } catch (IOException e) {
            System.out.println("Error writing numbers to file");
        }
    }
}