package com.pingwit_java_course.part21.homework.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class PartyInvitationList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Egorka Egorov");
        list.add("Ivan Khomich");
        list.add("Aleksandra Shishkina");
        list.add("Olga Wojciech");
        list.add("Billy Ailysh");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String name = scanner.nextLine();

        if (list.contains(name)) {
            System.out.println("Welcome to the party, " + name + "!");
        } else {
            System.out.println("Sorry, " + name + " , your name is not on the invitation list.");
        }
    }
}