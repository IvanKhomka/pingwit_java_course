package com.pingwit_java_course.part25.homework.task2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractAllowedManufacturers {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("iPhone 13", "Apple"),
                new Phone("Galaxy S21", "Samsung"),
                new Phone("Mi 11", "Xiaomi"),
                new Phone("Pixel 6", "Google")
        );

        Set<String> allowedManufacturers = Set.of("Apple", "Samsung", "Xiaomi");

        List<String> manufacturers = phones.stream()
                .map(phone -> phone.getManufacturer()) // не ошибка, но более современный стиль будет phone -> phone.getManufacturer() -> Phone::getManufacturer
                .filter(allowedManufacturers::contains)
                .collect(Collectors.toList()); //.collect(Collectors.toList()) -> toList()

        System.out.println("Allowed manufacturers: " + manufacturers);
    }
}