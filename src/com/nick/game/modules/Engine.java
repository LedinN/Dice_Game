package com.nick.game.modules;

import java.util.Random;

public class Engine {
    Random random = new Random();
    // THROW DICE FOR PLAYER
    public int diceRoller(int diceAmount, String playerName) {
        int sum = 0;
        for (int i = 0; i < diceAmount; i++) {
            int score = random.nextInt(6) + 1;
            System.out.println(playerName + " rolled a: " + score+"\n");
            sum = sum + score;
        }
        return sum;
    }
}
