package com.nick.game.modules;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static String[] playerNames = new String[6];
    public static int[] playerScores = new int[6];
    public static List<Integer> remainingPlayers = new ArrayList<Integer>();
    public static boolean isTie = false;
    public static int highestScore = 0;
    public static String highestScorePlayer;

    public Methods(String playerName) {
        savePlayerName(playerName,Game.currentPlayerIndex);
    }

    public void savePlayerName(String playerName, int playerIndex) {
            playerNames[playerIndex] = playerName;
    }
    // CHECK HIGHEST SCORE
    public static void highestScore(){
        remainingPlayers.clear();
        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] > highestScore){
                highestScore = playerScores[i];
                highestScorePlayer = playerNames[i];
            }
        }
        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] == highestScore){
                remainingPlayers.add(i);
            }
        }
    }
    // CHECK IF TIE
    public static void checkIfTie(){
        int tiecount = 0;

        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] >= highestScore){
                tiecount++;

                if (playerNames[remainingPlayers.get(0)] != playerNames[i])
                {
                    remainingPlayers.add(i);
                }
            }
        }

        if (tiecount > 0 && remainingPlayers.size() > 1){
            isTie = true;
        }
        else isTie = false;
        highestScore();
    }
    // PRINT PLAYERS THAT ARE TIED
    public static void remainingPlayersList(){

        for (int i = 0; i < remainingPlayers.size(); i++) {
            System.out.println(playerNames[remainingPlayers.get(i)]);
        }
    }
    // SET ALL SCORES TO 0
    public static void clearScores(){
        for (int i = 0; i < playerScores.length; i++) {
            playerScores[i] = 0;
        }
    }
}
