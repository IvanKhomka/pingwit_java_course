package com.pingwit_java_course.part14.homework.task6;

import java.util.Arrays;

public class EngineMarking {
    private static String ENGINE_VOLUME_FIRST_MARKING = "1.4";
    private static String ENGINE_VOLUME_SECOND_MARKING = "1.8";

    public static void main(String[] args) {
        String[] engines = {
                "1.4", "1.6", "1.8", "1.4", "1.8",
                "1.4", "2.2", "1.4", "1.8", "2.7"
        };

        for (int i = 0; i < engines.length; i++) {
            if (engines[i].equals(ENGINE_VOLUME_FIRST_MARKING)) {
                engines[i] = "2.0T";
            } else if (engines[i].equals(ENGINE_VOLUME_SECOND_MARKING)) {
                engines[i] = "1.8T";
            }
        }
        System.out.println("Changed markings: " + Arrays.toString(engines));
    }
}