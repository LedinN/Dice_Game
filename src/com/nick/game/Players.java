package com.nick.game;

public class Players {

    Players[] playersArray;
    {
        playersArray = new Players[new Game().playerCount];
    }
    private String playerName;
    private int highscore;

    public Players(String playerName, int highscore) {
        this.playerName = playerName;
        this.highscore = highscore;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getHighscore(){
        return highscore;
    }
    public void setHighscore(int highscore){
        this.highscore = highscore;
    }
}
