package com.nick.game;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Dice Game!\n \n [1] Play \n [2] Highscores\n [3] Exit\n");

        int choice = new UserInput().intScanner();

        switch (choice) {

            case 1:
                new Game().game();
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                break;


        }




    }



}
