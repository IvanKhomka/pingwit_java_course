package com.pingwit_java_course.part24.homework.task4;

import java.util.Calendar;

public class DiscountService {
    private static final double DISCOUNT_PERCENT = 0.10;

    public boolean isEligibleForDiscount(boolean isBirthday) {
        return isBirthday || isMarch8();
    }

    private boolean isMarch8() {
        //Лучше использовать ZonedDate (part 17), вместо Calendar
        Calendar today = Calendar.getInstance();
        return today.get(Calendar.MONTH) == Calendar.MARCH && today.get(Calendar.DAY_OF_MONTH) == 8;
    }

    public double applyDiscount(double price) {
        return price * (1 - DISCOUNT_PERCENT);
    }
}