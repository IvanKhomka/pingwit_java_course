package com.pingwit_java_course.part19.homework.task1and2;

import java.io.*;

public class MotorcycleApp {
    public static void main(String[] args) {

        Motorcycle moto = new Motorcycle("Yamaha", "R1", new Engine(998, "RRR11111"));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("moto.ser"))) {
            out.writeObject(moto);
            System.out.println("Motorcycle serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("moto.ser"))) {
            Motorcycle deserializedMoto = (Motorcycle) in.readObject();
            System.out.println("Deserialized Motorcycle: " + deserializedMoto);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}