package com.nick.game.modules;

import java.util.Random;
public class Game {
    Random random = new Random();
    public static int playerCount;
    public static int currentPlayerIndex = 0;
    public int sum;

    public void game() {
        // HUR MÅNGA SPELARE
        System.out.println("How many players? (2-6)");
        playerCount = new UserInput().intScanner();
        while (playerCount < 2 || playerCount > 6) {
            System.out.println("You need between 2 and 6 players, try again!");
            playerCount = new UserInput().intScanner();
        }
        // SKAPA SPELARE
        for (int i = 0; i < playerCount; i++) {
            System.out.println("Enter the name of Player " + (i + 1));
            new Methods(new UserInput().stringScanner(), currentPlayerIndex);
            System.out.println("Player "+(i+1) + "'s name is: " + Methods.playerNames[i] + "\n");
            currentPlayerIndex++;
        }
        currentPlayerIndex = 0;
        // HUR MÅNGA TÄRNINGAR
        System.out.println("How many dices should each player have?");
        int dices = new UserInput().intScanner();

        // KASTA TÄRNING, SPARA POÄNG
        for (int j = 0; j < playerCount; j++) {
            System.out.println("It's " + Methods.playerNames[j] + "s turn!\n Press 'Enter' to roll: ");
                new UserInput().pressEnter();
                sum = new Engine().diceRoller(dices, Methods.playerNames[j]);
            System.out.println(Methods.playerNames[j]+" got a total of "+sum+" points!\n");
            Methods.playerScores[j] = sum;

        }
        // JÄMFÖR POÄNG
        Methods.highestScore();
        Methods.checkIfTie();
        // HANTERA LIKA
        while (Methods.isTie){
            Methods.highestScore = 0;
            System.out.println("It's a tie between");
            Methods.remainingPlayersList();
            System.out.println("Sudden death mode active!");
            Methods.clearScores();
            for (int i = 0; i < Methods.remainingPlayers.size(); i++) {
                System.out.println("It's "+ Methods.playerNames[Methods.remainingPlayers.get(i)]+"s turn!\n Press 'Enter' to roll: ");
                new UserInput().pressEnter();
                sum = new Engine().diceRoller(1, Methods.playerNames[Methods.remainingPlayers.get(i)]);
                Methods.playerScores[Methods.remainingPlayers.get(i)] = sum;
            }
            Methods.isTie = false;
            Methods.remainingPlayers.clear();
            Methods.highestScore();
            Methods.checkIfTie();
        }
            System.out.println("The winner is "+ Methods.highestScorePlayer);

        }
    }






