package com.pingwit_java_course.part10.homework.task2;

public class Gearbox {
    private int currentGear = 0;

    public void shiftUp() {
        if (currentGear < 7) {
            currentGear++;
            System.out.println("Gear up: " + currentGear);
        } else {
            System.out.println("The maximum gear is already engaged.");
        }
    }

    public void shiftDown() {
        if (currentGear > 0) {
            currentGear--;
            System.out.println("Gear down: " + currentGear);
        } else {
            System.out.println("The gearbox is already in neutral.");
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setGear(int gear) {
        if (gear >= 0 && gear <= 7) {
            currentGear = gear;
            System.out.println("Gear is set to " + gear);
        }
    }
}

