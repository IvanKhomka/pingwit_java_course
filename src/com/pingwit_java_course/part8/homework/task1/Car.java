package com.pingwit_java_course.part8.homework.task1;

public class Car {
    String producer; //private
    String model; //private
    int doorsQuantity; //private

    public Car(String producer, String model, int doors) {
        this.producer = producer;
        this.model = model;
        this.doorsQuantity = doors;
    }

    public void openDoors() {
        for (int i = 1; i <= doorsQuantity; i++) {
            System.out.println("Дверь " + i + " открыта");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", doorsQuantity=" + doorsQuantity +
                '}';
    }
}

