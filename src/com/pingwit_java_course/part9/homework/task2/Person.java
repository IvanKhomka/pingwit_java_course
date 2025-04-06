package com.pingwit_java_course.part9.homework.task2;

public class Person {
        String firstName; // все поля класса должны быть приватными
        String lastName;
        int birthYear;
        Gender gender;
        MaritalStatus maritalStatus;

        public Person(String firstName, String lastName, int birthYear, Gender gender, MaritalStatus maritalStatus) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
            this.gender = gender;
            this.maritalStatus = maritalStatus;
        }

        // добавляй геттеры сразу на все поля класса, даже если другие данные не используешь. В реальных программах довольно редко увидишь геттер только для 1 поля
        public int getAge() {
            return birthYear;
        }
    }

