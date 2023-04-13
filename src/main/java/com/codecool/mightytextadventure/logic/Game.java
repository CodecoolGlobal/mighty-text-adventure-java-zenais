package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    public static final int INVALID_DIRECTION = -1;
    public static final int HELP = -2;
    public static final boolean GAME_END = false;
    public static final boolean GAME_ON = true;
    public static final String INVALID_DIRECTION_MESSAGE = "I don't understand, please try again?\n";
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
        boolean isRunning = GAME_ON;
        while (isRunning) {
            isRunning = step();
        }
    }

    private boolean step() {
        String description = player.getArea().toString();
        display.printMessage(description);

        if (player.getArea().isEnd()) {
            return GAME_END;
        }

        Integer playersChoice = input.getInputFromUser();
        int direction = player.getArea().getDirection(playersChoice);

        if (playersChoice.equals(HELP)) {
            Display.printHelp();
            input.getInputStringFromUser();
        } else if (direction == INVALID_DIRECTION) {
            display.printMessage(INVALID_DIRECTION_MESSAGE);
        } else {
            player.setArea(areas[direction]);
        }
        return GAME_ON;
    }
}
