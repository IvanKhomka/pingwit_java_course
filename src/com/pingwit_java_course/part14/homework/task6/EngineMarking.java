package com.pingwit_java_course.part14.homework.task6;

import java.util.Arrays;

public class EngineMarking {
    private static String ENGINE_VOLUME_FIRST_MARKING = "1.4"; // добавь final
    private static String ENGINE_VOLUME_SECOND_MARKING = "1.8"; // добавь final

    public static void main(String[] args) {
        String[] engines = {
                "1.4", "1.6", "1.8", "1.4", "1.8",
                "1.4", "2.2", "1.4", "1.8", "2.7"
        };

        for (int i = 0; i < engines.length; i++) {
            if (engines[i].equals(ENGINE_VOLUME_FIRST_MARKING)) { // ENGINE_VOLUME_FIRST_MARKING.equals(engines[i]), чтобы избежать NPE
                engines[i] = "2.0T"; // 2.0T тоже стоит вынести в константу
            } else if (engines[i].equals(ENGINE_VOLUME_SECOND_MARKING)) { // ENGINE_VOLUME_SECOND_MARKING.equals(engines[i]), чтобы избежать NPE
                engines[i] = "1.8T"; // 1.8T тоже стоит вынести в константу
            }
        }
        System.out.println("Changed markings: " + Arrays.toString(engines));
    }
}