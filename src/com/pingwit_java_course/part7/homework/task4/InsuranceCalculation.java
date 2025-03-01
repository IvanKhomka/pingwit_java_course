package com.pingwit_java_course.part7.homework.task4;

import java.util.Scanner;

public class InsuranceCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        double engineVolume = scanner.nextDouble(); // давай добавим здесь абзац. Это не ошибка, но так приятнее будет читать
        System.out.println("Были ли ДТП за прошлый год?(true/false):");
        boolean crashes = scanner.nextBoolean(); // crashes -> hasCrashes - так сразу понятно что это boolean переменная и давай добавим здесь абзац.
        System.out.println("Страховались ли у нас?(true/false):");
        boolean hadInsurance = scanner.nextBoolean();

        double rate = 0.25;
        double regularCustomerRate = hadInsurance ? 0.8 : 1.0;
        double crashedCustomerRate = crashes ? 1.2 : 1.0;
        double totalInsurance = engineVolume * rate * regularCustomerRate * crashedCustomerRate; // если знаешь про BigDecimal, то лучше через него такие операции делать

        System.out.println("Стоимость вашей страховки составила: " + totalInsurance + " Евро.");
// лишняя строка, давай удалим
    }
}
