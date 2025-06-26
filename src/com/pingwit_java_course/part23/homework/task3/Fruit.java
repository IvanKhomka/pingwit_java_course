package com.pingwit_java_course.part23.homework.task3;

public class Fruit {
    protected String name;
    protected double weight;
    protected String type;

    public Fruit(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}