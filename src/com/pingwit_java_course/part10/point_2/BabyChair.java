package com.pingwit_java_course.part10.point_2;

public class BabyChair extends Chair {
    public BabyChair(String color, String material, boolean rare) {
        super(color, material, rare);
        System.out.println("Hello from BabyChair");
    }

    public boolean isBaby() {
        return true;
    }
}
