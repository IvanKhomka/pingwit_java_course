package com.pingwit_java_course.part24.homework.task4;

public class Order {
    private Product product;
    private String deliveryAddress;
    private double finalPrice;

    public Order(Product product, String deliveryAddress, double finalPrice) {
        this.product = product;
        this.deliveryAddress = deliveryAddress;
        this.finalPrice = finalPrice;
    }

    public void printConfirmation() {
        System.out.println("\nСпасибо за ваш заказ на сумму: " + finalPrice + " руб.");
        System.out.println("Ваш заказ: " + product.getName());
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Курьер свяжется с вами в ближайшее время.");
    }
}