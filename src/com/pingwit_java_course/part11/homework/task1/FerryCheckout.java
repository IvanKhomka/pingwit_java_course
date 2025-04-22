package com.pingwit_java_course.part11.homework.task1;

public class FerryCheckout {

    public void processVehicles(Vehicle[] vehicles) {
        int totalPrice = 0;
        int totalPeople = 0;

        for (Vehicle vehicle : vehicles) {
            int price = 0;
            if (vehicle.getVehicleType() == VehicleType.CARGO) {
                price = 30; // в константу класса
            } else if (vehicle.getVehicleType() == VehicleType.PASSENGERS && vehicle.getPeopleOnBoard() <= 2) {
                price = 10; // в константу класса
            } else if (vehicle.getVehicleType() == VehicleType.PASSENGERS && vehicle.getPeopleOnBoard() > 2) {
                price = 15; // в константу класса
            }
            totalPrice += price;
            totalPeople += vehicle.getPeopleOnBoard();
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " pays: " + price + " euros with " + vehicle.getPeopleOnBoard() + " passengers.");
        }

        System.out.println("Total payment: " + totalPrice + " euros.");
        System.out.println("Total passengers on board: " + totalPeople);
    }
}

