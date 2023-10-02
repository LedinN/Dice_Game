package com.nick.game;

import java.util.Random;

public class Game {
    Random random = new Random();

    public void game() {

        // HUR MÅNGA SPELARE
        System.out.println("How many players?");
        int players = new UserInput().intScanner();
        String[][] playerData = new String[players][players];

        for (int i = 0; i < players; i++) {
            System.out.println("Enter the name of Player "+(i+1));
            playerData[i][0] = new UserInput().stringScanner();
            playerData[i][1] = "0";
            System.out.println("Player "+(i+1)+"'s name is: "+playerData[i][0]+"\n");
        }

        System.out.println("How many dices should each player have?");
        int dices = new UserInput().intScanner();

            for (int j = 0; j < players; j++) {

                System.out.println("It's " + playerData[j][0] + "s turn!\n Press 'Enter' to roll: ");

                for (int k = 0; k < dices; k++) {

                    int score = random.nextInt(6) + 1;
                    System.out.println(playerData[j][0]+" rolled a "+score);
                    playerData[j][1] += score;
                    System.out.println("Total points this round: "+playerData[j][1]);
                    new UserInput().pressEnter();
                }

            }

        }



        }





