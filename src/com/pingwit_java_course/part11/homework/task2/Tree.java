package com.pingwit_java_course.part11.homework.task2;

public class Tree {
    private final FruitType[] fruits;
    private final Tree[] children;

    public Tree(int fruitCount, int childrenCount) {
        this.fruits = new FruitType[fruitCount];
        this.children = new Tree[childrenCount];
    }

    public void setFruit(int index, FruitType fruit) {
        fruits[index] = fruit;
    }

    public void setChild(int index, Tree child) {
        children[index] = child;
    }

    public FruitType[] getFruits() {
        return fruits;
    }

    public Tree[] getChildren() {
        return children;
    }
}
