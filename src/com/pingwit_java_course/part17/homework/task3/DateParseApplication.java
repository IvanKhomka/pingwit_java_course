package com.pingwit_java_course.part17.homework.task3;

public class DateParseApplication {
    public static void main(String[] args) {

        String data = Application.DATA;

        PersonParser parser = new PersonParser();
        Person[] persons = parser.parsePersons(data);

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }
}