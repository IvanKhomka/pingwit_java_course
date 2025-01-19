package com.pingwit_java_course.part3.homework.task1;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {

        double PlnRate = 4.1;
        double EurRate = 0.9;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency Id: 1 for PLN, 2 for EUR");
        int currencyId = sc.nextInt();

        System.out.println("Enter USD amount to exchange");
        int amount = sc.nextInt();

        switch (currencyId) {
            case 1 -> System.out.println("You received " + amount * PlnRate + " PLN");
            case 2 -> System.out.println("You received " + amount * EurRate + " EUR");

            default -> System.out.println("Your bank can't exchange that type of currency");
        }
    }
}
