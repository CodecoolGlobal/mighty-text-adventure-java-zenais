package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    public static final int NO_POSSIBLE_DIRECTION = 0;
    public static final int INVALID_DIRECTION = -1;
    public static final int HELP = -2;
    private final Area[] areas;
    private final Input input;
    private final Display display;
    private Player player;

    public Game(Area[] areas, Input input, Display display, Player player) {
        this.areas = areas;
        this.input = input;
        this.display = display;
        this.player = player;
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

        if (player.getArea().isEnd()) {
            return false;
        }

        Integer playersChoice = input.getInputFromUser();
        display.printMessage("\n");
        int direction = player.getArea().getDirection(playersChoice);

        if (direction == NO_POSSIBLE_DIRECTION) {
            return false;
        }else if (playersChoice.equals(HELP)) {
            System.out.println("Let's continue...\n");
        } else if (direction == INVALID_DIRECTION) {
            System.out.println("I don't understand, please try again?\n");
        } else {
            player.setArea(areas[direction]);
        }
        return true;
    }
}
