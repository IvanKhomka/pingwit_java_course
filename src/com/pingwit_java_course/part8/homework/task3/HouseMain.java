package com.pingwit_java_course.part8.homework.task3;

public class HouseMain {
    public static void main(String[] args) {
        HouseCatalog catalog = new HouseCatalog(5);

        catalog.addHouse(new House(10, 50, true));
        catalog.addHouse(new House(4, 8, true));
        catalog.addHouse(new House(2, 5, false));
        catalog.addHouse(new House(6, 15, true));
        // если добавишь еще несколько домов в каталог, то на консоли будет странное сообщение
        // 'Каталог полон, дом не добавлен: 6 этажей, 15 жильцов'

        catalog.enableHeatingForLargeHouses();
    }
}
