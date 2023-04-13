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
        //display.printMessage("Hello " + Player.getName() + "! \nIt's friday night and you are standing in front of your friend's apartment complex.");


        Game game = new Game(areas, input, display, player);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Area[] loadAreas() {
        Area[] areas = new Area[47];
        areas[0] = new Area("Finally... Your first friday evening without any plans in WEEKS. Jamie even agreed to watch your favorite movie with you (hard to believe, as for the last ten times you had to watch it alone) and is snuggeling up to you on the couch. As the movie starts you shout out \"Halleluja! The Lord finally answered my prayers!\" Jamie is looking at you with a big smile. \"Happy Birthday, \"" + Player.getName() + "\n" +
                "Looks like this evening just couldn't get any better. But just before Scar pushes Mufasa into the stampede, your phone lights up... \"Thomas calling\"\n", new int[]{1, 32}, new String[]{"1 - Happy for any opportunity to delay Mufasa's death, you pick up the phone\n", "2 - HELL NO! Not now"});
        areas[1] = new Area("you on phone", new int[]{6, 3}, new String[]{"Yes(1)", "No(2)"});
        areas[2] = new Area("Martin");
        areas[3] = new Area("Martin", new int[]{1, 2, 4}, new String[]{"Yes(1)", "No(2)", "I don't know(3)"});
        areas[4] = new Area("Martin");
        areas[5] = new Area("Martin");
        areas[6] = new Area("Martin");
        areas[7] = new Area("Martin");
        areas[8] = new Area("Martin");
        areas[9] = new Area("Martin");
        areas[10] = new Area("30min later you and J standing in front of ?'s door");
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
        areas[32] = new Area("Without looking away from your tv-screen or even blinking your eyes you turn your phone upside down. Seconds later another phone starts ringing in the kitchen. While little Simba has to watch his father fall down a cliff in slow-motion, Jamie gets up and leaves the room. What a monster!\n" +
                "As Simba is falling asleep in the desert and you are wiping the tears off your face, J comes back to the living room and announces \"We are going out!\".\n", new int[]{33}, new String[]{"1 - Tears start rolling again"});
        areas[33] = new Area("J tells you, Thomas called to invite you both to this party at a mutual friend's place. Oh, how a perfect evening can change in mere seconds. You didn't even make it to \"Hakuna Matata\". You know exactly who is gonna be at this party. All of them J's friends and you don't like a single one of them. They are either boring or just straight up stupid. And Thomas, who's also hosting the party is especially strange. You don't really know why but you somehow just don't trust this guy.", new int[]{34, 10}, new String[]{"1 - You don't wanna go and start arguing with J", "2 - You don't wanna go but you accept your faith (" + Player.getName() + "not happy)"});
        areas[34] = new Area("J says \"I already promised and everyone is expecting you. I will look really bad, if you're not coming now!\"", new int[]{35, 36, 34, 10}, new String[]{"1 - You beg", "2 - You get angry", "3 - You try to reason with J", "4 - You don't wanna go but you accept your faith (" + Player.getName() + "not happy)"});
        areas[35] = new Area("J says \"Please... do it for me. And for them! You know how much they all love you! It will be so much fun!\"", new int[]{35, 36, 34, 10}, new String[]{"1 - You beg", "2 - You get angry", "3 - You try to reason with J", "4 - You don't wanna go but you accept your faith (" + Player.getName() + "not happy)"});
        areas[36] = new Area("After a short but very intense fight, J tells you \"Go to hell! Or better... stay at hell with your poorly drawn tigers, pigs and weasels\" and storms out your flat", new int[]{10, 40}, new String[]{"1 - You throw on some clothes and run after her", "2 - Exhausted you fall back on the couch"});
        areas[37] = new Area("", new int[]{}, new String[]{});
        areas[38] = new Area("", new int[]{}, new String[]{});
        areas[39] = new Area("", new int[]{}, new String[]{});
        areas[40] = new Area("You somehow feel bad for how the evening went down. But no! You weren't the one changing plans last minute. And also... it's YOUR \"big\" day, isn't it? Let all of them bore themselves to death! At least J will be sorry for not having stayed home after a few hours with this dimwits.\n" +
                "Soon the movie has caught your full attention again and as always... as soon as the end credits roll you feel... hmmm... just content.\n" +
                "But what's that? Something is glowing on the table, right next to your \"No.1 Partymachine\"-coffemug. J's phone. So storming out of the flat in a rage isn't the best party-preparation-strategy after all, huh..?", new int[]{41, 42}, new String[]{"1 - Look at the phone. You wanna know what important message J is missing", "2 - Ignore the phone. Not you're problem. You're just looking forward to J calling when getting home by Uber is going to be a problem without a phone"});
        areas[41] = new Area("", new int[]{}, new String[]{});
        areas[42] = new Area("Two hours later the end credits of your movie marathon's second movie wake you up from your not so restful slumber - pillows wet from your drool. Maybe you picked the wrong movie... why in hell would they make another movie - same story, same characters, still animated but just not looking like it!? Waste of money and time. That's the last time you've watched this one. For sure. For a second you think about getting dressed and joining J at the party after all. But then you decide to go to bed. Friday's are just to exhausting and it's already past 11. While brushing your teeth you check your instagram. And there it is! All those stupid people on one picture. All of them holding balloons and wearing party hats but making sad faces. And J standing in the center, holding a cake with one hand and flipping the bird at the camera with the other. \"Surprise parties without the surprise guest suck! #partypooper #simbashouldhavedied\"", new int[]{43}, new String[]{"1 - You turn of your phone"});
        areas[43] = new Area("Phew! You really dodged a bullet there! Surprise party... what the heck!? So... Guess you could say\n" +
                "\n" +
                "!!!! YOU WON !!!!\n" +
                "\n" +
                "Or did you? Lying in bed you start thinking again... something's off about this Thomas. And why does he have his arm around Jamie? And whose phone did J post this picture on her IG from? But then sleep overcomes you and carries you away to Pride Rock where to new king is about to get crowned...");
        areas[44] = new Area("", new int[]{}, new String[]{});
        areas[45] = new Area("", new int[]{}, new String[]{});
        areas[46] = new Area("", new int[]{}, new String[]{});
        return areas;
    }
}
