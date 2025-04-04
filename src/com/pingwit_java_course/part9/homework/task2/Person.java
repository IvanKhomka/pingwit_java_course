package com.pingwit_java_course.part9.homework.task2;

public class Person {
        String firstName;
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

        public int getAge() {
            return birthYear;
        }
    }

