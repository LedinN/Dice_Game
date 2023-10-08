package com.nick.game.modules;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    // Integer input
    public int intScanner() {
        System.out.println("Enter a number: ");
        while (!sc.hasNextInt()){
            System.out.println("That's not a number, try again!");
            sc.next();
        }
    return sc.nextInt();
    }

    // String input
    public String stringScanner() {
        System.out.println("Type: ");
        return sc.nextLine();
    }

    public void pressEnter() {
        sc.nextLine();
    }

}
