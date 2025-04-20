package com.pingwit_java_course.part10.homework.task2;

public class Gearbox {
    private int currentGear = 0; // а какое значение будет у поля currentGear если написать private int currentGear;, т.е. без явной инициализации

    public void shiftUp() {
        if (currentGear < 7) { // 7 в константу класса
            currentGear++;
            System.out.println("Gear up: " + currentGear);
        } else {
            System.out.println("The maximum gear is already engaged.");
        }
    }

    public void shiftDown() {
        if (currentGear > 0) { // 0 в константу класса
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
        if (gear >= 0 && gear <= 7) { // 0 и 7 в константы класса. У тебя выше уже использовались эти значения, сразу старайся выносить их в поля или константу и не работать с магическими числами
            currentGear = gear;
            System.out.println("Gear is set to " + gear);
        }
    }
}

