package com.pingwit_java_course.part8.homework.task2;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculate(Harvest[] harvests) {
        if (harvests == null || harvests.length == 0) {
            return new HarvestStatistic[0];
        }

        HarvestStatistic[] temp = new HarvestStatistic[harvests.length];
        int uniqueCount = 0;

        for (Harvest harvest : harvests) {
            if (harvest != null) {
                String currentPlant = harvest.getPlant();
                BigDecimal harvestWeight = harvest.getWeight();

                for (int i = 0; i < temp.length; i++) {
                    HarvestStatistic current = temp[i];
                    if (current == null) {
                        temp[i] = new HarvestStatistic(currentPlant, harvestWeight);
                        uniqueCount++;
                        break;
                    } else if (current.getPlant().equals(currentPlant)) {
                        current.setTotalWeight(current.getTotalWeight().add(harvestWeight));
                        break;
                    }
                }
            }
        }

        HarvestStatistic[] result = new HarvestStatistic[uniqueCount];
        int i = 0;
        while (i < uniqueCount) { // просто FYI: я не учел размер массива, поэтому здесь проще было бы использовать обычный for, а не while, т.к. все равно нужна доп. переменная 'i'. Можно оставить как есть, это не ошибка
            result[i] = temp[i];
            i++;
        }

        return result;
    }
}
