package com.pingwit_java_course.part25.homework.task4and5;

public class Car {
    private String model;
    private String manufacturer;
    private boolean isElectric; // isElectric -> electric

    public Car(String model, String manufacturer, boolean isElectric) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isElectric() {
        return isElectric;
    }
}