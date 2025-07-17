package com.pingwit_java_course.part25.homework.task6;

import java.util.List;

public class Traveler {
    private String name;
    private List<Country> visits; // visits -> visitedCountries - будет более явно

    public Traveler(String name, List<Country> visits) {
        this.name = name;
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public List<Country> getVisits() {
        return visits;
    }
}