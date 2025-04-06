package com.pingwit_java_course.part8.homework.task3;

public class House {
    private int floors;
    private int residents;
    private boolean heatingOn;
    private boolean isApartment; // Я прям настаиваю заменить boolean на String или enum

    public House(int floors, int residents, boolean isApartment) {
        this.floors = floors;
        this.residents = residents;
        this.heatingOn = false;
        this.isApartment = isApartment;
    }

    public int getFloors() {
        return floors;
    }

    public int getResidents() {
        return residents;
    }

    public boolean isApartment() {
        return isApartment;
    }

    public void enableHeating() {
        if (!heatingOn) {
            heatingOn = true;
            String type = isApartment ? "многоэтажке" : "загородном доме";
            System.out.println("Отопление включено в " + type + " с " + floors + " этажами и " + residents + " жильцами.");
        }
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }
}
