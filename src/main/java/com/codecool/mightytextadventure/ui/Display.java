package com.codecool.mightytextadventure.ui;

public class Display {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printScannerQuestion(String message) {
        System.out.print(message);
    }

    public static void printHelp() {
        System.out.println("----------------------------------------------");
        System.out.println("--- HELP INFORMATION");
        System.out.println("--- \"1\" to \"9\": \tChoose navigation option");
        System.out.println("--- \"h\" or \"help\": \tShow help information");
        System.out.println("----------------------------------------------\n");
        System.out.println("Let's continue...\n");
    }
}
