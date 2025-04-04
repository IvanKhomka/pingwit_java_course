package com.pingwit_java_course.part8.homework.task3;

public class HouseCatalog {
    private House[] houses;
    private int currentSize = 0;
    private int floors = 5;
    private int residents = 10;

    public HouseCatalog(int initialCapacity) {
        houses = new House[initialCapacity];
    }

    public void addHouse(House house) {
        if (currentSize >= houses.length) {
            expandCatalog();
        }
        houses[currentSize++] = house;
    }

    private void expandCatalog() {
        int newSize = houses.length * 2;
        House[] newHouses = new House[newSize];
        System.arraycopy(houses, 0, newHouses, 0, houses.length);
        houses = newHouses;
        System.out.println("Каталог расширен до " + newSize + " домов.");
    }

    public void enableHeatingForLargeHouses() {
        for (int i = 0; i < currentSize; i++) {
            if (houses[i] != null && houses[i].getFloors() > floors && houses[i].getResidents() > residents) {
                houses[i].enableHeating();
            }
        }
    }
}
