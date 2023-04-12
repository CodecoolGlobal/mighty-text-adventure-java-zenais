package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {

    public Integer getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        Integer choice = -1;
        try {
            choice = Integer.parseInt(scanner.next());
        }catch (NumberFormatException e){
            System.out.println("Did you fall asleep?");
        }
        return choice;
    }

}
