package com.nick.game;

import java.util.Random;

public class Game {
    Random random = new Random();

    public void game() {

        // HUR MÅNGA SPELARE
        System.out.println("How many players?");
        int players = new UserInput().intScanner();
        int[] highscore = new int[players];
        int sum = 0;
        String[] playernames = new String[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Enter the name of Player "+(i+1));
            playernames[i] = new UserInput().stringScanner();
            System.out.println("Player "+(i+1)+"'s name is: "+playernames[i]+"\n");
        }

        System.out.println("How many dices should each player have?");
        int dices = new UserInput().intScanner();

            for (int j = 0; j < players; j++) {

                System.out.println("It's " + playernames[j] + "s turn!\n Press 'Enter' to roll: ");

                for (int k = 0; k < dices; k++) {

                    int score = random.nextInt(6) + 1;
                    System.out.println(playernames[j]+" rolled a "+score);
                    sum += score;
                    System.out.println("Total points this round: "+sum);
                    new UserInput().pressEnter();
                }

            }

        }



        }





