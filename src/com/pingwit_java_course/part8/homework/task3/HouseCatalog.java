package com.pingwit_java_course.part8.homework.task3;

public class HouseCatalog {
    private House[] houses;
    private int currentSize = 0; // currentSize - скорее всего это поле хранит указатель на последний добавленный дом. Давай переименуем в housePointer или lastHouseIndex
    private int floors = 5; // если мы захотим включить отопление для 3-х этажных домов, то придется менять код, поэтому это хороший кандидат на аргумент метода enableHeatingForLargeHouses()
    private int residents = 10; // если мы захотим включить отопление домов, где проживает более 10 человек, то придется менять код, поэтому это хороший кандидат на аргумент метода enableHeatingForLargeHouses()

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
        int newSize = houses.length * 2; // 2 - это магическое число, давай в константу класса
        House[] newHouses = new House[newSize];
        System.arraycopy(houses, 0, newHouses, 0, houses.length);
        houses = newHouses;
        System.out.println("Каталог расширен до " + newSize + " домов.");
    }

    public void enableHeatingForLargeHouses() { // enableHeatingForLargeHouses -> давай сделаем метода более универсальным и назовем просто enableHeating(...)
        for (int i = 0; i < currentSize; i++) {
            if (houses[i] != null && houses[i].getFloors() > floors && houses[i].getResidents() > residents) {
                houses[i].enableHeating();
            }
        }
    }
}
