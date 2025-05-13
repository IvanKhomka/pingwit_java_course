package com.pingwit_java_course.part15.homework;

import java.util.Random;

public class FightService {
    private final Random random;

    public FightService(Random random) {
        this.random = random;
    }

    public int generateRandomMove() {
        return random.nextInt(3) + 1;
    }

    public boolean attackHits(int attack, int block) {
        return attack != block;
    }
}