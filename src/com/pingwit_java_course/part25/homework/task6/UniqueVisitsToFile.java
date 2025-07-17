package com.pingwit_java_course.part25.homework.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueVisitsToFile {
    public static void main(String[] args) {
        List<Traveler> travelers = List.of(
                new Traveler("Ivan", List.of(
                        new Country("France", List.of("Paris", "Lyon")),
                        new Country("Germany", List.of("Berlin", "Munich"))
                )),
                new Traveler("Egorka", List.of( // спасибо
                        new Country("France", List.of("Marseille", "Lyon")),
                        new Country("Italy", List.of("Rome", "Milan"))
                )),
                new Traveler("Anna", List.of(
                        new Country("Germany", List.of("Berlin")),
                        new Country("Italy", List.of("Venice", "Milan"))
                ))
        );

        Set<String> uniqueCities = travelers.stream()
                .flatMap(traveler -> traveler.getVisits().stream())
                .flatMap(visit -> visit.getCities().stream())
                .collect(Collectors.toSet());
        /*
        ...
        .flatMap(visit -> visit.getCities().stream())
        .distinct()
        .collect(Collectors.joining(","));
        и тогда сразу получишь строку вместо Set<String>
         */

        String result = String.join(", ", uniqueCities);

        System.out.println("Unique cities: " + result);

        try {
            Files.writeString(Path.of("unique_cities.txt"), result);
            System.out.println("Successfully written to unique_cities.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}