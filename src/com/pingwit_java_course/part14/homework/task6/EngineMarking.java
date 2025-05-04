package com.pingwit_java_course.part14.homework.task6;

import java.util.Arrays;

public class EngineMarking {
    private static final String ENGINE_VOLUME_FIRST_MARKING = "1.4";
    private static final String ENGINE_VOLUME_SECOND_MARKING = "1.8";
    private static final String ENGINE_VOLUME_THIRD_MARKING = "2.0T";
    private static final String ENGINE_VOLUME_FOURTH_MARKING = "1.8T";

    public static void main(String[] args) {
        String[] engines = {
                "1.4", "1.6", "1.8", "1.4", "1.8",
                "1.4", "2.2", "1.4", "1.8", "2.7"
        };

        for (int i = 0; i < engines.length; i++) {
            if (ENGINE_VOLUME_FIRST_MARKING.equals(engines[i])) {
                engines[i] = ENGINE_VOLUME_THIRD_MARKING;
            } else if (ENGINE_VOLUME_SECOND_MARKING.equals(engines[i])) {
                engines[i] = ENGINE_VOLUME_FOURTH_MARKING;
            }
        }
        System.out.println("Changed markings: " + Arrays.toString(engines));
    }
}