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
        areas[12] = new Area("This is a truly wise decision. You've heard and seen enough so far and now you're tired. It's time for power nap. There must be a couch somewhere around...",
                new int[]{13, 14},
                new String[]{"(1) Let's check upstairs.", "(2) Stay here, you still have some rest energy left."}
        );
        areas[13] = new Area("You are going upstairs. None of the guests recognized that you are sneaking into the forbidden area. " +
                "Your are checking the first door - it's locked...",
                new int[]{14, 15},
                new String[]{"(1) This is a sign to go back downstairs.", "(2) You are curious, check the next door."}
        );
        areas[14] = new Area("It seems nothing interesting here...",
                new int[]{16, 17},
                new String[]{"(1) Scream loud into the room to get everybody's attention.", "(2) Away from the guests in the corner there is a commode. You try secretly to open one of it's drawers. "}
        );
        areas[15] = new Area("Carefully you are listening if you can hear somebody behind the door... ",
                new int[]{18, 14},
                new String[]{"(1) You open it.", "(2) You feel uncomfortable and want to go back downstairs."}
        );
        areas[16] = new Area("Everybody is looking at you. You are starting to dance, some guests are confused," +
                " but the majority now also dances with you.",
                new int[]{12, 11},
                new String[]{"(1) Dancing can be exhausting, time for a power nap.", "(2) Talk to Thomas."}
        );
        areas[17] = new Area("There is a tiny box with a smiley on it. You like it, you take it, you keep it.",
                new int[]{14, 1},
                new String[]{"(1) Go back to center of the room.", "(2) Go to room \"21\"."}
        );
        areas[18] = new Area("""
                You are entering the room. It seems to be completely empty.\s
                It's windy and cold in here, because the window is completely open. You are going to close it,\s
                but suddenly the light goes out and the door slams shut. You notice a shadow of a figure in the corner...  \s""",
                new int[]{19, 20},
                new String[]{"(1) Throw your flashlight at it.", "(2) Shine the flashlight in it's face."}
        );
        areas[19] = new Area("The flashlight goes on and shines right in the persons face. You notice it's just a mannequin." +
                "\nThat was creepy, though...",
                new int[]{11, 5},
                new String[]{"(1) Go back downstairs to the other guests.", "(2) Do something."}
        );
        areas[20] = new Area("It's your partner shouting at you to wake up and go to work, because you are already late! " +
                "You are looking around you - was everything a dream...?",
                new int[]{0, 31},
                new String[]{"(1) You are trying to hide under the covers and snooze another 10 minutes.", "(2) You are calming down your partner and get out of bed. "}
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
