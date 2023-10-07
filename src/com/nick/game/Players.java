package com.nick.game;
import java.util.ArrayList;
import java.util.List;

public class Players {
    public static String[][] playerNames = new String[2][6];
    public static int[] playerScores = new int[Game.playerCount];
    public static List<Integer> remainingPlayers = new ArrayList<Integer>();
    public static boolean isTie = false;
    public static int highestScore = 0;
    public static String highestScorePlayer;

    public Players(String playerName, int currentPlayerIndex) {
        savePlayerName(playerName,Game.currentPlayerIndex);
    }

    public void savePlayerName(String playerName, int playerIndex) {
            playerNames[0][playerIndex] = "Player "+(playerIndex+1);
            playerNames[1][playerIndex] = playerName;
    }

    public static void highestScore(){ // CHECK HIGHEST SCORE
        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] > highestScore){
                highestScore = playerScores[i];
                highestScorePlayer = playerNames[1][i];
            }
        }
        for (int i = 0; i < playerScores[i]; i++) {
            if (playerScores[i] == highestScore){
                remainingPlayers.add(i);
            }
        }
    }

    public static void checkIfTie(){
        int tiecount = 0;
        for (int i = 0; i < playerScores.length; i++) {
            if (playerScores[i] == highestScore && highestScorePlayer != playerNames[1][i]){
                remainingPlayers.add(i);
               // remainingPlayers[i] = i;
                tiecount++;
            }
        }
        if (tiecount > 0){
            isTie = true;
        }

    }
    public static void remainingPlayersList(){
        for (int i = 0; i < remainingPlayers.size(); i++) {
            System.out.println(playerNames[1][remainingPlayers.get(i)]);
        }
    }
    public static void clearScores(){
        for (int i = 0; i < playerScores.length; i++) {
            playerScores[i] = 0;

        }
    }
}
