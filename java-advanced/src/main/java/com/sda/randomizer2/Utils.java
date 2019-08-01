package com.sda.randomizer2;

import java.util.Random;

public class Utils {
    int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1 + min);
    }


}
