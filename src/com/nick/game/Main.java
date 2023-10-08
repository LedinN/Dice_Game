package com.nick.game;

import com.nick.game.modules.Game;
import com.nick.game.modules.UserInput;

public class Main {
    public static void main(String[] args) {
        int choice;

        while (true) {
            System.out.println("Welcome to Dice Game!\n \n [1] Play \n [2] Exit\n");
            choice = new UserInput().intScanner();

            switch (choice) {

                case 1:
                    new Game().game();
                    break;
                case 2:
                    System.out.println("Exiting program..");
                    return;

                default:
                    System.out.println("Try again!");
                    break;

            }

        }

    }
}


