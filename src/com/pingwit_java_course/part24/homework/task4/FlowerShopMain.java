package com.pingwit_java_course.part24.homework.task4;

import java.util.Scanner;

public class FlowerShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop shop = new FlowerShop();
        DiscountService discountService = new DiscountService();

        while (true) {
            shop.showCatalog();

            System.out.println("\nВыберите номер позиции или введите 'exit' для выхода:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Спасибо за визит! До свидания.");
                System.exit(0);
            }

            int choice;
            try { // давай парсинг вынесем в отдельный метод, а проверку на isValidProductId оставим здесь
                choice = Integer.parseInt(input);
                if (!shop.isValidProductId(choice)) {
                    System.out.println("Такой позиции нет или она недоступна. Попробуйте ещё раз.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите номер позиции.");
                continue;
            }

            Product product = shop.getProductById(choice);
            double price = product.getPrice();

            System.out.println("Сегодня у вас день рождения? (да/нет): ");
            String birthdayInput = scanner.nextLine();
            boolean isBirthday = birthdayInput.equalsIgnoreCase("да"); // за использование equalsIgnoreCase плюсик в карму

            if (discountService.isEligibleForDiscount(isBirthday)) {
                System.out.println("В честь праздника мы дарим вам скидку 10% на весь заказ!");
                price = discountService.applyDiscount(price);
            }

            System.out.println("Введите, пожалуйста, адрес доставки:");
            String address = scanner.nextLine();

            Order order = new Order(product, address, price);
            order.printConfirmation();
            //если пользователь вводит некорректные данные - программа должна с ними справиться - здесь все ок
            //если заказ прошел успешно, программа должна сама остановиться - вот это давай добавим
        }
    }
}