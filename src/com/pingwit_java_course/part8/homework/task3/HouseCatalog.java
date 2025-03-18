package com.pingwit_java_course.part8.homework.task3;

public class HouseCatalog {
    private House[] houses;
    private int houseCount = 0; // Если хочешь ограничить размер каталога, то это поле стоит переименовать в maxSize

    public HouseCatalog(int size) {
        houses = new House[size];
    }

    public void addHouse(House house) {
        if (houseCount < houses.length) { // а зачем ограничивать размер каталога?
            houses[houseCount++] = house;
        } else {
            System.out.println("Каталог полон, дом не добавлен: " + house.getFloors() + " этажей, " + house.getResidents() + " жильцов");
        }
    }

    public void enableHeatingForLargeHouses() {
        for (int i = 0; i < houseCount; i++) {
            // 5 и 10 - это магические числа (т.е. без контекста непонятно что они в себе хранят), вынеси их в переменную, чтобы четко было видно их предназначение
            if (houses[i] != null && houses[i].getFloors() > 5 && houses[i].getResidents() > 10) {
                houses[i].enableHeating();
            }
        }
    }
}
