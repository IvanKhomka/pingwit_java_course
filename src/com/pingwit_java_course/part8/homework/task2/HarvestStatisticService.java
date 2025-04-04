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

                boolean found = false;
                for (int j = 0; j < uniqueCount; j++) {
                    if (temp[j].getPlant().equals(currentPlant)) {
                        temp[j] = new HarvestStatistic(
                                currentPlant,
                                temp[j].getTotalWeight().add(harvestWeight)
                        );
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    temp[uniqueCount++] = new HarvestStatistic(currentPlant, harvestWeight);
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
