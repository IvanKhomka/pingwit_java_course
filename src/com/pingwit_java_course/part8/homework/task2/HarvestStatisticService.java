package com.pingwit_java_course.part8.homework.task2;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculate(Harvest[] harvests) {
        if (harvests == null || harvests.length == 0) {
            return new HarvestStatistic[0];
        }

        int uniqueCount = 0;
        HarvestStatistic[] temp = new HarvestStatistic[harvests.length];

        for (int i = 0; i < harvests.length; i++) {
            if (harvests[i] != null) {
                String currentPlant = harvests[i].getPlant();
                BigDecimal totalWeight = harvests[i].getWeight();
                boolean isNew = true;

                for (int j = 0; j < uniqueCount; j++) {
                    if (temp[j] != null && temp[j].getPlant() == currentPlant) {
                        isNew = false;
                        temp[j] = new HarvestStatistic(currentPlant,
                                temp[j].getTotalWeight().add(totalWeight));
                        break;
                    }
                }

                if (isNew) {
                    temp[uniqueCount] = new HarvestStatistic(currentPlant, totalWeight);
                    uniqueCount++;
                }
            }
        }

        HarvestStatistic[] result = new HarvestStatistic[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
