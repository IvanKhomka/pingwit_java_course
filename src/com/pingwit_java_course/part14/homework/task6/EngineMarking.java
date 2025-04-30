package com.pingwit_java_course.part14.homework.task6;

import java.util.Arrays;

public class EngineMarking {
    public static void main(String[] args) {
        String[] engines = {
                "1.4", "1.6", "1.8", "1.4", "1.8",
                "1.4", "2.2", "1.4", "1.8", "2.7"
        };

        for (int i = 0; i < engines.length; i++) {
            if (engines[i].equals("1.4")) {
                engines[i] = "2.0T";
            } else if (engines[i].equals("1.8")) {
                engines[i] = "1.8T";
            }
        }
        System.out.println("Changed markings: " + Arrays.toString(engines));
    }
}