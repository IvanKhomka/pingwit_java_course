package com.pingwit_java_course.part7.homework.task4;

import java.math.BigDecimal;
import java.util.Scanner;

public class InsuranceCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        double engineVolume = scanner.nextDouble();

        System.out.println("Были ли ДТП за прошлый год?(true/false):");
        boolean hasCrashes = scanner.nextBoolean();

        System.out.println("Страховались ли у нас?(true/false):");
        boolean hadInsurance = scanner.nextBoolean();

        double rate = 0.25;
        double regularCustomerRate = hadInsurance ? 0.8 : 1.0;
        double crashedCustomerRate = hasCrashes ? 1.2 : 1.0;
        BigDecimal totalInsurance = BigDecimal.valueOf(engineVolume * rate * regularCustomerRate * crashedCustomerRate); // у тебя все переменные должны быть BigDecimal и затем вызываешь метод multiply()
        // текущий вариант будет работать, но если рейты поменяются, то можешь увидеть неожиданный результат.
        // попробуй rate = 0.29, engineVolume=1, hasCrashes=true, hadInsurance=false, regularCustomerRate=0.7, crashedCustomerRate=1.3. И параллельно посчитай в калькуляторе

        System.out.println("Стоимость вашей страховки составила: " + totalInsurance + " Евро.");
    }
}
