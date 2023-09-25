package com.nick.game;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    // Integer input
    public int intScanner() {
        while (!sc.hasNextInt()){
            System.out.println("Please enter a number.");
            sc.next();
        }
    return sc.nextInt();
    }

    // String input
    public String stringScanner() {

        return "placeholder";
    }
}
