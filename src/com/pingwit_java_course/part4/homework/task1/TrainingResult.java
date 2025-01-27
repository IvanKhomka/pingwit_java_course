package com.pingwit_java_course.part4.homework.task1;

public class TrainingResult {
    public static void main(String[] args) {

        int daysOfTraining; // если не используешь переменную за пределами цикла, то создавай там, где она используется
        double dailyDistance = 10.0;
        double totalDistance = dailyDistance;

        System.out.println("Your distance at 1 day " + totalDistance + " km");

        for (daysOfTraining = 2; daysOfTraining <= 7; daysOfTraining++) { // daysOfTraining = 2; -> int daysOfTraining = 2;
            dailyDistance = (dailyDistance * 0.1 + dailyDistance); // скобки здесь не нужны
            totalDistance += dailyDistance;
            System.out.println("Your distance at " + daysOfTraining + " day " + totalDistance + " km");
        }
        System.out.println("Your total weekly distance " + totalDistance + " km");
    }
}
