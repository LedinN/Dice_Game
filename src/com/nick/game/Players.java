package com.nick.game;

public class Players {

    public static String[][] playerNames = new String[2][6];
    public static int[] playerScores = new int[Game.playerCount];
    public static int score;
    public static int playerIndex = Game.currentPlayerIndex;
    public static boolean isTie = false;


    public Players(String playerName, int currentPlayerIndex) {
        savePlayerName(playerName,Game.currentPlayerIndex);
    }

    public void savePlayerName(String playerName, int playerIndex) {
            playerNames[0][playerIndex] = "Player "+(playerIndex+1);
            playerNames[1][playerIndex] = playerName;
    }

    public void gameDecider(){
        int highestScore = 0;
        int tieCount = 0;
        int highestScoreIndex = 1500;
        for (int i = 0; i < playerScores.length; i++) {
            if (highestScore < playerScores[i]){
                highestScore = playerScores[i];
            }
        }
        for (int i = 0; i < playerScores.length; i++) {

            if (highestScore == playerScores[i]){
                tieCount ++;
                highestScoreIndex = i;
            }
            if (tieCount > 1){
                isTie = true;
            } else if (tieCount == 1) {
                System.out.println(playerNames[1][highestScoreIndex]+" is the winner!");
            }


        }

    }
}
