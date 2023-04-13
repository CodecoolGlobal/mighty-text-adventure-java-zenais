package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public Integer getInputFromUser() {
        String userInput = scanner.next();
        Integer choice = -1;
        try {
            if (userInput.equalsIgnoreCase("help") ||
                    userInput.equalsIgnoreCase("h")) {
                Display.printHelp();
                return -2;
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
