package com.pingwit_java_course.part8.homework.task3;

import com.pingwit_java_course.part9.homework.task2.HouseType;

public class House {
    private int floors;
    private int residents;
    private boolean heatingOn;
    private HouseType houseType;

    public House(int floors, int residents, HouseType houseType) {
        this.floors = floors;
        this.residents = residents;
        this.heatingOn = false;
        this.houseType = houseType;
    }

    public int getFloors() {
        return floors;
    }

    public int getResidents() {
        return residents;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void enableHeating() {
        if (!heatingOn) {
            heatingOn = true;
            String type = (houseType == HouseType.APARTMENT) ? "многоэтажке" : "загородном доме";
            System.out.println("Отопление включено в " + type + " с " + floors + " этажами и " + residents + " жильцами.");
        }
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }
}
