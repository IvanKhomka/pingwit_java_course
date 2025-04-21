package com.pingwit_java_course.part11.homework.task2;

public class TreeMain {
    public static void main(String[] args) {

        Tree root = new Tree(2, 2);
        root.setFruit(0, FruitType.BANANA);
        root.setFruit(1, FruitType.COCONUT);

        Tree branch1 = new Tree(1, 0);
        branch1.setFruit(0, FruitType.BANANA);

        Tree branch2 = new Tree(2, 0);
        branch2.setFruit(0, FruitType.COCONUT);
        branch2.setFruit(1, FruitType.COCONUT);

        root.setChild(0, branch1);
        root.setChild(1, branch2);

        Monkey bananaMonkey = new BananaMonkey();
        Monkey coconutMonkey = new CoconutMonkey();
        Monkey smartMonkey = new SmartMonkey();

        MonkeyManager manager = new MonkeyManager();

        System.out.println("Бананов: " + manager.askMonkeyToCountFruits(bananaMonkey, root));
        System.out.println("Кокосов: " + manager.askMonkeyToCountFruits(coconutMonkey, root));
        System.out.println("Всего фруктов: " + manager.askMonkeyToCountFruits(smartMonkey, root));
    }
}

