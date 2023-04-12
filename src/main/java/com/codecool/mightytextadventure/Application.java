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
        display.printMessage("Hello " + Player.getName() + "! \nIt's friday night and you are standing in front of your friend's apartment complex.");


        Game game = new Game(areas, input, display, player);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas() {
        Area[] areas = new Area[32];
        areas[0] = new Area("Start room", new int[]{11, 2}, new String[]{"Yes(1)", "No(2)"});
        areas[1] = new Area("Martin", new int[]{6, 3}, new String[]{"Yes(1)", "No(2)"});
        areas[2] = new Area("Martin", new int[]{6}, new String[]{"Yes"});
        areas[3] = new Area("Martin", new int[]{1, 2, 4}, new String[]{"Yes(1)", "No(2)", "I don't know(3)"});
        areas[4] = new Area("Martin");
        areas[5] = new Area("Martin");
        areas[6] = new Area("Martin");
        areas[7] = new Area("Martin");
        areas[8] = new Area("Martin");
        areas[9] = new Area("Martin");
        areas[10] = new Area("Martin");
        areas[11] = new Area("You change your mind and go straight forward to Thomas. He is telling you about a app called \"Restlverwerter\"," +
                " which was one of his projects at some web module of a coding school...",
                new int[]{10, 12},
                new String[]{"(1) He catches your attention. You want to hear more and trying to sympathize with him.", "(2) You are getting bored. " +
                        "Show hom indirectly that you want to leave this conversation. Point one foot in the direction you want to go."}
        );
        areas[12] = new Area("This is a truly wise decision. You've heard enough so far and now you're tired. It's time for power nap. There must be a couch somewhere around...",
                new int[]{13, 14},
                new String[]{"(1) Let's check upstairs.", "(2) Stay here, you still have some rest energy left."}
        );
        areas[13] = new Area("You are going upstairs. None of the guests recognized that you are sneaking into the forbidden area. Your are checking first door - it's locked...",
                new int[]{14, 15},
                new String[]{"(1) This is a sign to go back downstairs.", "(2) You are curious. Check the next door."}
        );
        areas[14] = new Area("It seems nothing interesting here...",
                new int[]{16, 17},
                new String[]{"(1) Scream loud into the room to get everybody's attention.", "(2) Away from the guests in the corner there is a commode. You try secretly to open one of it's drawers. "}
        );
        areas[15] = new Area("Carefully you are listening if you can hear somebody behind the door. Open it? ",
                new int[]{1, 1},
                new String[]{"AAA (1)", "BBB (2)"}
        );
        areas[16] = new Area("Guest attention",
                new int[]{1, 1},
                new String[]{"AAA (1)", "BBB (2)"}
        );
        areas[17] = new Area("There is  a tiny box with a smiley on it. You like it so you take it.",
                new int[]{1, 1},
                new String[]{"AAA (1)", "BBB (2)"}
        );
        areas[18] = new Area("Text",
                new int[]{1, 1},
                new String[]{"AAA (1)", "BBB (2)"}
        );
        areas[19] = new Area("Text",
                new int[]{1, 1},
                new String[]{"AAA (1)", "BBB (2)"}
        );
        areas[20] = new Area("Text",
                new int[]{1, 1},
                new String[]{"AAA (1)", "BBB (2)"}
        );
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
