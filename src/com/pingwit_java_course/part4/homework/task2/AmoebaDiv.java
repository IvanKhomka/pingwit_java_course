package com.pingwit_java_course.part4.homework.task2;

public class AmoebaDiv {
    public static void main(String[] args) {

        int amoebaCell = 1;
        int divTime; // эту удаляем

        // divTime = 3; -> int divTime = 3;
        for (divTime = 3; divTime <= 24; divTime = divTime + 3) { // можно заменить divTime = divTime + 3 на divTime += 3
            amoebaCell += amoebaCell;
            System.out.println("Total amoeba cells in " + divTime + " hours " + amoebaCell);
        }
    }
}
