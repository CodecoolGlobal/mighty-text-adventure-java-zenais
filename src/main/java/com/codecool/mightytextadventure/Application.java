package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();

        Game game = new Game(areas, input, display);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas(){
        Area[] areas =   new Area[7];
        areas[0] = new Area("Start room", new int[]{1, 2}, new String[]{"Yes(1)", "No(2)"});
        areas[1] = new Area("Go to End", new int[]{6, 3}, new String[]{"Yes(1)", "No(2)"});
        areas[2] = new Area("You have to go to End", new int[]{6},new String[]{"Yes"});
        areas[3] = new Area("Room 3", new int[]{1, 2, 4}, new String[]{"Yes(1)", "No(2)", "I don't know(3)"});
        areas[4] = new Area("You're trapped");
        areas[5] = new Area("Room 5");
        areas[6] = new Area("End");
        return areas;
    }
}
