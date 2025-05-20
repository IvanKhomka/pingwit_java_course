package com.pingwit_java_course.part18.homework.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextToFile {
    public static void main(String[] args) {
        String sentence = "This is the line that will be written into file\n"; // \n - это не часть текста в данном случае, это часть бизнес логики. Не обязательно записывать каждое предложение с новой строки, это может быть просто пробел
        // если очень хочешь записывать в файл с новой строки, можно использовать writer.newLine();
        String fileName = "myFile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 1000; i++) {
                writer.write(sentence);
            }
            System.out.println("File successfully written to: " + fileName);
        } catch (IOException e) {
            System.out.println("Failed to write into file: " + e.getMessage());
        }
    }
}