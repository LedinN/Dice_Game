package com.nick.game;

public class Game {


    public void game() {

        System.out.println("How many players?");
        int players = new UserInput().intScanner();
        String[] playernames = new String[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Enter the name of Player "+(i+1));
            playernames[i] = new UserInput().stringScanner();
            System.out.println("Player "+(i+1)+"'s name is: "+playernames[i]);
        }


        System.out.println("How many dices should each player have?");
        int dices = new UserInput().intScanner();

        System.out.println("How many rounds do you want to play?");
        int rounds = new UserInput().intScanner();




        }





    }
