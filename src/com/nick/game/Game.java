package com.nick.game;
import com.nick.game.test.Engine;

import java.util.Arrays;
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
            new Players(new UserInput().stringScanner(), currentPlayerIndex);
            System.out.println(Players.playerNames[0][i] + "'s name is: " + Players.playerNames[1][i] + "\n");
            currentPlayerIndex++;
        }
        currentPlayerIndex = 0;
        // HUR MÅNGA TÄRNINGAR
        System.out.println("How many dices should each player have?");
        int dices = new UserInput().intScanner();


        for (int j = 0; j < playerCount; j++) { // KASTA TÄRNING, SPARA POÄNG
            System.out.println("It's " + Players.playerNames[1][j] + "s turn!\n Press 'Enter' to roll: ");
                new UserInput().pressEnter();
                sum = new Engine().diceRoller(dices,Players.playerNames[1][j]);
            System.out.println(Players.playerNames[1][j]+" got a total of "+sum+" points!\n");
            Players.playerScores[j] = sum;

        } // JÄMFÖR POÄNG

        Players.highestScore();
        Players.checkIfTie();

        while (Players.isTie){
            System.out.println("It's a tie between");
            Players.remainingPlayersList();
            System.out.println("Sudden death mode active!");
            Players.clearScores();
            for (int i = 0; i < Players.remainingPlayers.size(); i++) {
                System.out.println("It's "+Players.playerNames[1][Players.remainingPlayers.get(i)]+"s turn!\n Press 'Enter' to roll: ");
                new UserInput().pressEnter();
                sum = new Engine().diceRoller(1,Players.playerNames[1][Players.remainingPlayers.get(i)]);
                Players.playerScores[Players.remainingPlayers.get(i)] = sum;
            }
            Players.isTie = false;
            Players.remainingPlayers.clear();
            Players.highestScore();
            Players.checkIfTie();
        }
            System.out.println("The winner is "+Players.highestScorePlayer);

        }
    }






