package com.pingwit_java_course.part8.homework.task3;

public class HouseCatalog {
    private House[] houses;
    private int houseCount = 0;

    public HouseCatalog(int size) {
        houses = new House[size];
    }

    public void addHouse(House house) {
        if (houseCount < houses.length) {
            houses[houseCount++] = house;
        } else {
            System.out.println("Каталог полон, дом не добавлен: " + house.getFloors() + " этажей, " + house.getResidents() + " жильцов");
        }
    }

    public void enableHeatingForLargeHouses() {
        for (int i = 0; i < houseCount; i++) {
            if (houses[i] != null && houses[i].getFloors() > 5 && houses[i].getResidents() > 10) {
                houses[i].enableHeating();
            }
        }
    }
}
