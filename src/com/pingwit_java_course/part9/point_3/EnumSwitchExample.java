package com.pingwit_java_course.part9.point_3;

import java.util.Arrays;

import com.pingwit_java_course.part9.Dog;

public class EnumSwitchExample {
    public static void main(String[] args) {
        Dog mops = new Dog(DogType.MOPS, "black");
        Dog bassenji = new Dog(DogType.BASSENJI, "red");
        Dog beagle = new Dog(DogType.BEAGLE, "red");

        DogType dogType = DogType.valueOf("BASSENJI");

        Dog pickResult;

        switch (dogType) {
            case BASSENJI -> pickResult = bassenji;
            case BEAGLE -> pickResult = beagle;
            default -> pickResult = mops;
        }

        System.out.println(pickResult);
        System.out.println(pickResult.type().isBarking());

        System.out.println(dogType.name());
        System.out.println(Arrays.toString(DogType.values()));

        System.out.println(dogType == DogType.BASSENJI);
        System.out.println(dogType == DogType.BEAGLE);
    }
}
