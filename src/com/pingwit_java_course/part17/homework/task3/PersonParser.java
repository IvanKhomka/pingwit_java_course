package com.pingwit_java_course.part17.homework.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PersonParser {
    public Person[] parsePersons(String data) {
        String[] personDataArray = data.split("; ");
        Person[] persons = new Person[personDataArray.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM"); // это хороший кандидат для константы класса

        for (int i = 0; i < personDataArray.length; i++) {
            String[] fields = personDataArray[i].split(",");
            try {
                String firstName = fields[0].trim();
                String lastName = fields[1].trim();
                String passportNumber = fields[2].trim();
                LocalDate birthDate = LocalDate.parse(fields[3].trim(), formatter);

                persons[i] = new Person(firstName, lastName, passportNumber, birthDate);
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date for person: " + personDataArray[i]);
                persons[i] = null; // а для чего эта строка? Только не удаляй, мне нужны обоснования :)
            }
        }
        return persons;
    }
}