package com.nick.game;

public class Players {

    public static String[][] playerNames = new String[2][6];
    public static int[] highscores = new int[6];
    public static String playerName;
    public static int score;
    public static int playerIndex = Game.currentPlayerIndex;


    public Players(String playerName,int playerIndex) {
        savePlayerName(playerName,Game.currentPlayerIndex);
    }

    public void savePlayerName(String playerName, int playerIndex) {
            playerNames[0][playerIndex] = "Player "+(playerIndex+1);
            playerNames[1][playerIndex] = playerName;
    }

    //public String getPlayerName(){
    //    return playerName;
    //}
    //public int getHighscore(){
    //    return highscore;
    //}
    public void setHighscore(int score,String playerName){


    }
}
