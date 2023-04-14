package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {
    public static final int INVALID_CHOICE = -1;
    public static final int HELP = -2;
    private final Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInputFromUser() {
        String userInput = scanner.next();
        int choice = INVALID_CHOICE;
        try {
            if (userInput.equalsIgnoreCase("help") ||
                    userInput.equalsIgnoreCase("h")) {
                return HELP;
            }
            choice = Integer.parseInt(userInput);

        } catch (NumberFormatException e) {
            System.out.println("Did you fall asleep?");
        }
        return choice;
    }

    public String getInputStringFromUser() {
        return scanner.next();
    }
}
