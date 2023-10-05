package com.nick.game;
import java.util.Random;
public class Game {
    Random random = new Random();
    public static int playerCount;
    public static int currentPlayerIndex = 0;
    int sum;
    public void game()
    {
        // HUR MÅNGA SPELARE
        System.out.println("How many players? (2-6)");
         playerCount = new UserInput().intScanner();
         while (playerCount < 2 || playerCount > 6){
             System.out.println("You need between 2 and 6 players, try again!");
             playerCount = new UserInput().intScanner();
         }
        // SKAPA SPELARE
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter the name of Player "+(i+1));
            new Players(new UserInput().stringScanner(),currentPlayerIndex);
            System.out.println(Players.playerNames[0][i] + "'s name is: " + Players.playerNames[1][i] + "\n");
            currentPlayerIndex++;
        }
        // HUR MÅNGA TÄRNINGAR
        System.out.println("How many dices should each player have?");
        int dices = new UserInput().intScanner();
            for (int j = 0; j < playerCount; j++) {

                System.out.println("It's " + Players.playerNames[1][j] + "s turn!\n Press 'Enter' to roll: ");

                for (int k = 0; k < dices; k++) {
                    new UserInput().pressEnter();
                    int score = random.nextInt(6) + 1;
                    System.out.println(Players.playerNames[1][j]+" rolled a "+score);
                    sum = sum + score;
                }
                System.out.println(Players.playerNames[1][j]+"s total points: "+sum);
                if (Players.playerScores[j] < sum){
                    Players.playerScores[j] = sum;

                }
                sum = 0;

            }
            new Players("", currentPlayerIndex).gameDecider();
        }



        }





