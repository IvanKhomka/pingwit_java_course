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
                BigDecimal totalWeight = harvests[i].getWeight(); // totalWeight -> harvestWeight - поскольку это вес одного растения
                boolean isNew = true;

                /*
                Давай попробуем упростить алгоритм, ответив на несколько вопросов:
                1. Если мы бежим по массиву HarvestStatistic и встретили растение с таким же названием, то можем ли мы обновить вес и прервать текущий цикл?
                2. Если мы встретили в массиве HarvestStatistic значение null, значит ли это, что текущее растение в данном массиве отсутствует?
                 */
                for (int j = 0; j < uniqueCount; j++) {
                    // temp[j].getPlant() == currentPlant классы всегда сравниваем только через 'equals()', через '==' только примитивы
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
