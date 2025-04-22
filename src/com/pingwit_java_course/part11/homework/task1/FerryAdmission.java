package com.pingwit_java_course.part11.homework.task1;

public class FerryAdmission {

    public boolean isFerryAllowed(Vehicle[] vehicles) {
        int totalPeople = 0;
        double totalWeight = 0;

        for (Vehicle vehicle : vehicles) {
            totalPeople += vehicle.getPeopleOnBoard();
            totalWeight += vehicle.getWeight();
        }

        boolean allowed = totalPeople <= 50 && totalWeight < 15000;

        return allowed;
    }
}

