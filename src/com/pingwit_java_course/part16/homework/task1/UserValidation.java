package com.pingwit_java_course.part16.homework.task1;

public class UserValidation { // UserValidationService будет более правильным названием
    public boolean validate(User user) {
        String inputLetters = "[a-zA-Zа-яА-Я]+"; // хороший кандидат для константы класса
        String inputEmail = "^[\\w._%+-]+@[\\w.-]+\\.(com|pl)$";// хороший кандидат для константы класса
        String inputPhone = "\\d+";// хороший кандидат для константы класса

        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            System.out.println("Username can't be empty.");
            return false;
        }

        if (!user.getFirstName().matches(inputLetters)) {
            System.out.println(String.format("Name can contain only letters, you entered invalid name: %s", user.getFirstName())); // посмотри что подсказывает идея вместо использования String.format(). Хороший вариант
            return false;
        }

        if (!user.getLastName().matches(inputLetters)) {
            System.out.println(String.format("Surname can contain only letters, you entered invalid surname: %s", user.getLastName()));// посмотри что подсказывает идея вместо использования String.format(). Хороший вариант
            return false;
        }

        if (!user.getEmail().matches(inputEmail)) {
            System.out.println(String.format("Email must contain @ and have a valid domain (.com, .pl ), you entered invalid email: %s", user.getEmail()));// посмотри что подсказывает идея вместо использования String.format(). Хороший вариант
            return false;
        }

        if (!user.getPhone().matches(inputPhone)) {
            System.out.println(String.format("Phone num can contain only numbers, you entered invalid phone num: %s", user.getPhone()));// посмотри что подсказывает идея вместо использования String.format(). Хороший вариант
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println("Password can't be empty.");
            return false;
        }
        return true;
    }
}
