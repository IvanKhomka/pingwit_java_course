package com.pingwit_java_course.part8.homework.task3;

import com.pingwit_java_course.part9.homework.task2.HouseType;

public class HouseMain {
    public static void main(String[] args) {
        HouseCatalog catalog = new HouseCatalog(5);

        catalog.addHouse(new House(10, 50, HouseType.APARTMENT));
        catalog.addHouse(new House(4, 8, HouseType.APARTMENT));
        catalog.addHouse(new House(2, 5, HouseType.COUNTRY_HOUSE));
        catalog.addHouse(new House(6, 15, HouseType.APARTMENT));
        catalog.addHouse(new House(6, 15, HouseType.APARTMENT));
        catalog.addHouse(new House(6, 15, HouseType.APARTMENT));
        catalog.addHouse(new House(6, 15, HouseType.APARTMENT));
        catalog.addHouse(new House(6, 15, HouseType.APARTMENT));

        catalog.enableHeating(5, 10);
    }
}
