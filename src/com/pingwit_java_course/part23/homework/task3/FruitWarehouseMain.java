package com.pingwit_java_course.part23.homework.task3;

import java.util.*;

public class FruitWarehouseMain {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit("Orange", 10, "Citrus"),
                new Fruit("Mandarin", 5, "Citrus"),
                new Fruit("Mango", 8, "Tropical"),
                new Fruit("Peach", 7, "Stone fruit"),
                new Fruit("Apricot", 4, "Stone fruit"),
                new Fruit("Pineapple", 3, "Tropical")
        );

        Map<String, List<Fruit>> grouped = new HashMap<>();

        for (Fruit fruit : fruits) {
            if (!grouped.containsKey(fruit.type)) {
                grouped.put(fruit.type, new ArrayList<>());
            }
            grouped.get(fruit.type).add(fruit);
        }

        for (Map.Entry<String, List<Fruit>> entry : grouped.entrySet()) {
            String type = entry.getKey();
            List<Fruit> group = entry.getValue();

            double totalWeight = 0;
            for (Fruit fruit : group) {
                totalWeight += fruit.weight;
            }

            Collections.sort(group, new Comparator<Fruit>() {
                @Override
                public int compare(Fruit f1, Fruit f2) {
                    return f1.name.compareTo(f2.name);
                }
            });

            System.out.println("\nType: " + type);
            System.out.println("Total weight: " + totalWeight + " kg");
            System.out.println("Fruits: " + group);
        }
    }
}