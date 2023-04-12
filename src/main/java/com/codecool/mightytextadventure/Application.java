package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();

        display.printScannerQuestion("Enter player's name: ");
        String playersName = input.getInputStringFromUser();
        while (!playersName.matches("[a-zA-Z]+")) {
            display.printScannerQuestion("Only characters are allowed! Please enter a valid name: ");
            playersName = input.getInputStringFromUser();
        }
        Player player = new Player(playersName, areas[0], new ArrayList<>());
        display.printMessage("Hello " +Player.getName() +"! \n It's friday night and you are standing in front of your friend's apartment complex.");


        Game game = new Game(areas, input, display, player);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas(){
        Area[] areas =   new Area[32];
        areas[0] = new Area("Start room", new int[]{1, 2}, new String[]{"Yes(1)", "No(2)"});
        areas[1] = new Area("Martin", new int[]{6, 3}, new String[]{"Yes(1)", "No(2)"});
        areas[2] = new Area("Martin", new int[]{6},new String[]{"Yes"});
        areas[3] = new Area("Martin", new int[]{1, 2, 4}, new String[]{"Yes(1)", "No(2)", "I don't know(3)"});
        areas[4] = new Area("Martin");
        areas[5] = new Area("Martin");
        areas[6] = new Area("Martin");
        areas[7] = new Area("Martin");
        areas[8] = new Area("Martin");
        areas[9] = new Area("Martin");
        areas[10] = new Area("Martin");
        areas[11] = new Area("Thomas");
        areas[12] = new Area("Thomas");
        areas[13] = new Area("Thomas");
        areas[14] = new Area("Thomas");
        areas[15] = new Area("Thomas");
        areas[16] = new Area("Thomas");
        areas[17] = new Area("Thomas");
        areas[18] = new Area("Thomas");
        areas[19] = new Area("Thomas");
        areas[20] = new Area("Thomas");
        areas[21] = new Area("Zinaida");
        areas[22] = new Area("Zinaida");
        areas[23] = new Area("Zinaida");
        areas[24] = new Area("Zinaida");
        areas[25] = new Area("Zinaida");
        areas[26] = new Area("Zinaida");
        areas[27] = new Area("Zinaida");
        areas[28] = new Area("Zinaida");
        areas[29] = new Area("Zinaida");
        areas[30] = new Area("Zinaida");
        areas[31] = new Area("End");
        return areas;
    }
}
