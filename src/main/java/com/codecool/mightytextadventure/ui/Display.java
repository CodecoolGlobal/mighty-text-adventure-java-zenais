package com.codecool.mightytextadventure.ui;

public class Display {

    public static void printHelp() {
        String message = """
                "----------------------------------------------
                        --- HELP INFORMATION
                        --- \\"1\\" to \\"9\\": \\tChoose navigation option
                        --- \\"h\\" or \\"help\\": \\tShow help information
                        ----------------------------------------------
                        Pres ENTER, then let's continue...
                 """;
        System.out.println(message);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printScannerQuestion(String message) {
        System.out.print(message);
    }
}
