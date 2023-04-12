package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.ArrayList;

public class Game {
    private final Area[] areas;
    private final Input input;
    private final Display display;
    private Player player;

    public Game(Area[] areas, Input input, Display display) {
        this.areas = areas;
        this.input = input;
        this.display = display;

        //TODO: create Payer Method
        player = new Player("Karl Marx", areas[0], new ArrayList<>());
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            isRunning = step();
        }
    }

    private boolean step() {
        String description = player.getArea().toString();
        display.printMessage(description);

        Integer playerChoice = input.getInputFromUser();
        int direction = player.getArea().getDirection(playerChoice);

        if (direction == 0) {
            return false;
        } else if (direction == -1) {
            System.out.println("I don't understand, please try again?");
        } else {
            player.setArea(areas[direction]);
        }
        return true;
    }
}
