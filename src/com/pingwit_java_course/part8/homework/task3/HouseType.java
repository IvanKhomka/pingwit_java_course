package com.pingwit_java_course.part8.homework.task3;

public enum HouseType {
    APARTMENT("Многоэтажном доме"),
    COUNTRY_HOUSE("Загородном доме");

    private final String name;

    HouseType(String name) {
        this.name = name;
    } // здесь абзац
    public String getName() {
        return name;
    }
}
