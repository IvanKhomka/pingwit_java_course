package com.pingwit_java_course.part17.homework.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PersonParser {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-dd-MM");

    public Person[] parsePersons(String data) {
        String[] personDataArray = data.split("; ");
        Person[] persons = new Person[personDataArray.length];

        for (int i = 0; i < personDataArray.length; i++) {
            String[] fields = personDataArray[i].split(",");
            try {
                String firstName = fields[0].trim();
                String lastName = fields[1].trim();
                String passportNumber = fields[2].trim();
                LocalDate birthDate = LocalDate.parse(fields[3].trim(), DATE_FORMATTER);

                persons[i] = new Person(firstName, lastName, passportNumber, birthDate);
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date for person: " + personDataArray[i]);
                persons[i] = null; // Как указание, что парсинг для данного индекса провалился, хотя уже понял, что эта строка в целом лишняя
                // - Верно. Можешь попробовать заменить на некорректную дату и через дебаг увидишь после какой строки код уйдет в блок catch
            }
        }
        return persons;
    }
}