package com.pingwit_java_course.part11.homework.task2;

public class CoconutMonkey extends Monkey {
    @Override
    public int countFruits(Tree branch) { // метод countFruits для CoconutMonkey и BananaMonkey отличается только FruitType, остальная логика абсолютно одинаковая. Давай в Monkey сделаем protected метод, который будет принимать Tree и FruitType, а здесь будем его вызвать
        int count = 0;
        for (FruitType fruit : branch.getFruits()) {
            if (fruit == FruitType.COCONUT) { // FruitType.COCONUT == fruit
                count++;
            }
        }
        for (Tree child : branch.getChildren()) {
            if (child != null) {
                count += countFruits(child);
            }
        }
        return count;
    }
}

