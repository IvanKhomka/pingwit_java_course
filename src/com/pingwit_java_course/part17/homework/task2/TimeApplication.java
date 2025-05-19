package com.pingwit_java_course.part17.homework.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeApplication {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        DateTimeFormatter dateTimeFormatter7 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        LocalDate parse = LocalDate.parse("2023-17-01", dateTimeFormatter);
        LocalDate parse2 = LocalDate.parse("23-2022-01", dateTimeFormatter2);
        LocalDate parse3 = LocalDate.parse("15-07-2024", dateTimeFormatter3);

        // на текущую задачу это не влияет, но для читаемости я бы не рекомендовал печатать строки через " ". Читабельнее будет по одному форматтеру в каждый System.out.println()
        System.out.println(dateTimeFormatter.format(parse) + " " + dateTimeFormatter4.format(parse) + " " +
                dateTimeFormatter5.format(parse) + " " + dateTimeFormatter6.format(parse) + " " + dateTimeFormatter7.format(parse));

        System.out.println(dateTimeFormatter2.format(parse2) + " " + dateTimeFormatter4.format(parse2) + " " +
                dateTimeFormatter5.format(parse2) + " " + dateTimeFormatter6.format(parse2) + " " + dateTimeFormatter7.format(parse2));

        System.out.println(dateTimeFormatter3.format(parse3) + " " + dateTimeFormatter4.format(parse3) + " " +
                dateTimeFormatter5.format(parse3) + " " + dateTimeFormatter6.format(parse3) + " " + dateTimeFormatter7.format(parse3));

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter8 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy, HH:mm");
        System.out.println(dateTimeFormatter8.getLocale().getCountry());
        System.out.println("The current daytime is: " + dateTimeFormatter8.format(localDateTime) + ".");
    }
}
