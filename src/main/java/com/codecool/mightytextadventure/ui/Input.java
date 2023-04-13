package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {
    public static final int INVALID_CHOICE = -1;
    public static final int HELP = -2;
    Scanner scanner = new Scanner(System.in);

    public Integer getInputFromUser() {
        String userInput = scanner.next();
        Integer choice = INVALID_CHOICE;
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
