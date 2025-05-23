package com.pingwit_java_course.part16;

public class ValidationExample {
    public static void main(String[] args) throws IllegalAccessException {
        ValidatedPerson person = new ValidatedPerson("ef", 25);

        PersonNameValidationService personNameValidationService = new PersonNameValidationService();
        PersonValidationService validationService = new PersonValidationService(personNameValidationService);

        boolean validationResult = validationService.validate(person);

        if (validationResult) {
            System.out.println("Validation passed");
        } else {
            System.out.println("Validation failed");
        }
    }
}
