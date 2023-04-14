package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);

        display.printMessage("Starting Mighty Text Adventure!");

        Player player = createPlayer(display, input);

        Area[] areas = loadAreas();

        player.setArea(areas[0]);
        System.out.println(Player.getName());

        Game game = new Game(areas, input, display, player);
        game.run();

        display.printMessage("Exiting from Mighty Text Adventure!");
    }

    private static Player createPlayer(Display display, Input input) {
        display.printScannerQuestion("Enter player's name: ");
        String playersName = input.getInputStringFromUser();
        while (!playersName.matches("[a-zA-Z]+")) {
            display.printScannerQuestion("Only characters are allowed! Please enter a valid name: ");
            playersName = input.getInputStringFromUser();
        }
        return   new Player(playersName, new ArrayList<>());
    }

    private static Area[] loadAreas() {
        Area[] areas = new Area[61];
        areas[0] = new Area(
                "Hello " + Player.getName() + "!" + "\nFinally... Your first friday evening without any plans in WEEKS. Jamie even agreed to watch your \n" +
                        "favorite movie with you (hard to believe, as for the last ten times you had to watch it alone) and \n" +
                        "is snuggling up to you on the couch. As the movie starts you shout out \"Hallelujah! The Lord finally \n" +
                        "answered my prayers!\" Jamie is looking at you with a big smile. \"Happy Birthday, " + Player.getName() + "\"" +
                        "\nLooks like this evening just couldn't get any better. But just before Scar pushes Mufasa into the \n" +
                        "stampede, your phone lights up... \"Thomas calling\"\n",
                new int[]{1, 32},
                new String[]{
                        "1 - Happy for any opportunity to delay Mufasa's death, you pick up the phone",
                        "2 - HELL NO! Not now"});
        areas[1] = new Area(
                "For a moment you consider just ignore the call. You don't even know, why Thomas is calling YOU.\n" +
                        "He's Jamie's friend. Not yours. To be honest, you don't don't even like him that much. You don't\n" +
                        "know why but something about him just doesn't sit right with you. Doesn't feel like you could trust\n" +
                        "this guy.\n" +
                        "But you're in a good mood and he most probably just wants to congratulate you. So you pick up the \n" +
                        "phone and answer the call.\n" +
                        "Oh what a mistake! Thomas tells you about this spontaneous party at his place and asks you and J\n" +
                        "to come. NOW! In the middle of this almost historical movie date!\n" +
                        "Totally taken by surprise you tell him, you have to talk to J first. After hanging up you want to\n" +
                        "punch yourself in the face for this.\n" +
                        "What to do now?\n",
                new int[]{2, 5},
                new String[]{
                        "1 - You tell J it was just a birthday call and nothing more. Maybe you're lucky...",
                        "2 - You tell J about the party at Thomas' place"});
        areas[2] = new Area("Yeah... nice try! J immediately knows, you're lying. You're just way too honest to be a good lyer.\n" +
                "Or maybe your phone was loud enough for J to be able to listen to everything Thomas just said. \n" +
                "Anyways... you start fighting. Gone is your good mood and a lot of arguments for staying home. Of\n" +
                "course J wants to go to the party. You don't. This fight could go on forever.\n",
                new int[]{10, 3, 4},
                new String[]{
                        "1 - You decide the take the highroad and agree to go to the party. But certainly not for very long",
                        "2 - You turn on the tv again, skip to \"Hakuna Matata\" and start singing along",
                        "3 - You just say \"No! A thousand times no!\""
                });
        areas[3] = new Area("J stands there for a minute just looking at you then says: \"Go to hell! Or better... \n" +
                "stay at hell with your poorly drawn tigers, pigs and weasels. I'm going to the party!\" and storms out the flat.\n",
                new int[]{10, 40},
                new String[]{"1 - You throw on some clothes and run after her",
                        "2 - Exhausted you fall back on the couch"});
        areas[4] = new Area(
                "J looks at you and says: \"You're just a big child\". Thats enough! What a shi**y thing to say.\n" +
                        "Especially on your birthday and only because you would rather watch this movie than go to a boring\n" +
                        "party.\n",
                new int[]{22},
                new String[]{"1 - You grab your jacket and storm out the door"});
        areas[5] = new Area("So you tell J about the invitation but you right away add that you don't want to go.\n" +
                "Why? Because you just started a movie and it's so nice on the couch and and and. And because there's\n" +
                "only gonna be J's friends at the party and sometimes you don't really feel comfortable with them.\n" +
                "Ok... maybe the last one was a mistake. J seems to get a bit angry...\n",
                new int[]{10, 36},
                new String[]{
                        "1 - You don't want to ruin the evening and agree to go to the party",
                        "2 - Of course you get angry, too"
                });
        areas[6] = new Area("", new int[]{}, new String[]{});
        areas[7] = new Area("", new int[]{}, new String[]{});
        areas[8] = new Area("", new int[]{}, new String[]{});
        areas[9] = new Area("", new int[]{}, new String[]{});
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //Thomas StoryLine
        areas[10] = new Area(
                "30 minutes later you and Jamie are standing in front of Thomas' door. You are in a gloomy mood.\n" +
                        "The whole way here J was just on the phone, texting. Not that you would have preferred to talk,\n" +
                        "but thats just straight up rude.\n" +
                        "You should have stayed home.\n" +
                        "J rings the bell and as soon as Thomas opens the door starts running into the living room. Thomas\n" +
                        "close behind. \n" +
                        "What the heck!? Something is going on between Thomas and Jamie. Now you are sure, Thomas was the\n" +
                        "one J was on the phone with, all the time. But no! Not with you! A proud lion won't be treated\n" +
                        "like that!\n" +
                        "You take off your shoes and your jacket and slowly run after them. From your last visit you know,\n" +
                        "Thomas' floor is always pretty slippery. (That's probably another reason you don't like him. He\n" +
                        "just shouldn't have laughed so hard!)\n" +
                        "As you enter the living room, you're thunderstruck. All of J's stupid friends are standing there.\n" +
                        "Balloons in their hands and party hats on their heads. Only J, standing in the middle, is holding a cake.\n",
                new int[]{52},
                new String[]{"1 - You start to sweat"}
        );
        areas[11] = new Area(
                "You change your mind and go straight forward to Thomas. He is telling you about a app called\n" +
                "\"Restlverwerter\", which was one of his projects at some web module of a coding school...",
                new int[]{10, 12},
                new String[]{"1 - He catches your attention. You want to hear more and trying to sympathize with him.",
                        "2 - You are getting bored." +
                                "3 - Show him indirectly that you want to leave this conversation. Point one foot in the direction you want to go."}
        );
        areas[12] = new Area(
                "This is a truly wise decision. You've heard and seen enough so far and now you're tired.\n" +
                "It's time for power nap. There must be a couch somewhere around...",
                new int[]{13, 14},
                new String[]{
                        "1 - Let's check upstairs.",
                        "2 - Stay here, you still have some rest energy left."}
        );
        areas[13] = new Area(
                "You are going upstairs. None of the guests recognized that you are sneaking into the forbidden area. " +
                "Your are checking the first door - it's locked...",
                new int[]{14, 15},
                new String[]{
                        "1 - This is a sign to go back downstairs.",
                        "2 - You are curious, check the next door."}
        );
        areas[14] = new Area(
                "It seems nothing interesting here...",
                new int[]{16, 17},
                new String[]{
                        "1 - Scream loud into the room to get everybody's attention.",
                        "2 - Away from the guests in the corner there is a commode." +
                                "You try secretly to open one of it's drawers. "}
        );
        areas[15] = new Area(
                "Carefully you are listening if you can hear somebody behind the door... ",
                new int[]{18, 14},
                new String[]{
                        "1 - You open it.",
                        "2 - You feel uncomfortable and want to go back downstairs."}
        );
        areas[16] = new Area(
                "Everybody is looking at you. You are starting to dance, some guests are confused," +
                " but the majority now also dances with you.",
                new int[]{12, 11},
                new String[]{
                        "1 - Dancing can be exhausting, time for a power nap.",
                        "2 - Talk to Thomas."}
        );
        areas[17] = new Area(
                "There is a tiny box with a smiley on it. You like it, you take it, you keep it.",
                new int[]{14, 22},
                new String[]{
                        "1 - Go back to center of the room.",
                        "2 - Leave flat, with mysterious box in pocket."}
        );
        areas[18] = new Area("""
                You are entering the room. It seems to be completely empty.\s
                It's windy and cold in here, because the window is completely open. You are going to close it,\s
                but suddenly the light goes out and the door slams shut. You notice a shadow of a figure in the corner...  \s""",
                new int[]{19, 20},
                new String[]{
                        "1 - Throw your flashlight at it.",
                        "2 - Shine the flashlight in it's face."}
        );
        areas[19] = new Area(
                "The flashlight goes on and shines right in the persons face. You notice it's just a mannequin." +
                "\nThat was creepy, though...",
                new int[]{11, 5},
                new String[]{
                        "1 - Go back downstairs to the other guests.",
                        "2 - Do something."}
        );
        areas[20] = new Area(
                "It's your partner shouting at you to wake up and go to work, because you are already late! " +
                "You are looking around you - was everything a dream...?",
                new int[]{0, 31},
                new String[]{
                        "1 - You are trying to hide under the covers and snooze another 10 minutes.",
                        "2 - You are calming down your partner and get out of bed. "}
        );
        ////////////////////////////////////////////////////////////////////////////////////////////////
        //Zinaida StoryLINE
        areas[21] = new Area(
                "Bad idea, soon J pulls your blanket off you, forcing you to abandon all hope\n" +
                        " of watching movie till the end.",
                new int[]{10, 22},
                new String[]{
                        "1 - Do what you have to do, and dress up!",
                        "2 - Have a fight, then leave the flat!"}
        );
        areas[22] = new Area(
                "Three hours later you find yourself staring through the window of a coffee shop, funny ... \n" +
                        "You notice Martin entering the building close to you.",
                new int[]{23, 24},
                new String[]{
                        "1 - Who cares, stay and finish your drink!",
                        "2 - Pay bill and follow him!"}
        );
        areas[23] = new Area(
                "While thinking about party, you reach for pocket only to find mysterious cube. You...",
                new int[]{24, 10, 25},
                new String[]{
                        "1 - Think of Martin... What was he thinking going there?",
                        "2 - Think of Thomas... is the party over?",
                        "3 - Think of J ... do I have to say sorry?"
                }
        );
        areas[24] = new Area(
                "Before you knew it you're standing in dim lighted building. This seems ominous... you...",
                new int[]{26},
                new String[]{
                        "1 - Curiosity got better of you. Follow Martin in and find out what happens..."}
        );
        areas[25] = new Area(
                "Wait... what's happening. Everything is spinning. You feel sick... \n" +
                        "You discover you teleported, or maybe woke up. Magic smiley box is still there. Wait... what to do?",
                new int[]{0},
                new String[]{
                        "1 - The only thing you can do. Wait and see what happens.\n" +
                                "You hear yourself thinking... "}
        );
        areas[26] = new Area(
                "You are in dim  lighted building, after what seems like 100 stairs, you reach strange room...\n" +
                        "Inside is a big Table full of computers, on each is written: Please enter the KEY: ",
                new int[]{27, 29},
                new String[]{
                        "1 - You remember the box, you look for it",
                        "2 - Ask Martin if he knows something."
                }
        );
        // explanation look into box for key
        areas[27] = new Area(
                "In your hands there is this strange box, You notice there is an opening",
                new int[]{28, 10},
                new String[]{
                        "1 - Look inside the box",
                        "2 - Leave the flat, maybe is party is better"
                }
        );
        // key found enter the game explanation provided
        areas[28] = new Area(
                "Wow, this is strange, there is something written inside. It could be key",
                new int[]{31, 30},
                new String[]{
                        "1 - Try the key on computer",
                        "2 - Just quit, you're to tired for this"}
        );
        // search key in the room, ask Martin
        areas[29] = new Area(
                "Martin, The key? Hmmmmm... I have no clue...",
                new int[]{30, 28},
                new String[]{
                        "1 - Very disappointed you bow your head",
                        "2 - There's still hope, check the smiley box"}
        );
        areas[30] = new Area(
                "You've accepted your loss. Maybe you should have just stayed at home :(");
        areas[31] = new Area(
                "Yay FINALLY, you have the KEY. You spend the rest of the evening playing text adventure...");
        //////////////////////////////////////////////////////////////////////////////////////////
        // Martins StoryLINE
        areas[32] = new Area(
                "Without looking away from your tv-screen or even blinking your eyes you turn your phone upside down. \n" +
                        "Seconds later another phone starts ringing in the kitchen. While little Simba has to watch his father \n" +
                        "fall down a cliff in slow-motion, Jamie gets up and leaves the room. What a monster!\n" +
                        "As Simba is falling asleep in the desert and you are wiping the tears off your face, J comes back to \n" +
                        "the living room and announces \"We are going out!\".\n",
                new int[]{33},
                new String[]{
                        "1 - Tears start rolling again"});
        areas[33] = new Area(
                "J tells you, Thomas called to invite you both to this party at his place. Oh, how a perfect evening \n" +
                        "can change in mere seconds. You didn't even make it to \"Hakuna Matata\". You know exactly who is \n" +
                        "gonna be at this party. All of J's friends and you don't like a single one of them. They are either \n" +
                        "boring or just straight up stupid. And Thomas is especially strange. You don't really know why but \n" +
                        "somehow you just don't trust this guy.\n",
                new int[]{34, 10},
                new String[]{
                        "1 - You don't want to go and start arguing with J",
                        "2 - You don't want to go but you accept your faith (" + Player.getName() + " not happy)"});
        areas[34] = new Area(
                "J says \"I already promised and everyone is expecting you. I will look really bad, if you're not \n" +
                        "coming now!\"\n",
                new int[]{35, 36, 34, 10},
                new String[]{
                        "1 - You beg",
                        "2 - You get angry",
                        "3 - You try to reason with J",
                        "4 - You don't want to go but you accept your faith (" + Player.getName() + " not happy)"});
        areas[35] = new Area(
                "J says \"Please... do it for me. And for them! You know how much they all love you! It will be so much fun!\"\n",
                new int[]{35, 36, 34, 10},
                new String[]{
                        "1 - You beg",
                        "2 - You get angry",
                        "3 - You try to reason with J",
                        "4 - You don't wanna go but you accept your faith (" + Player.getName() + " not happy)"});
        areas[36] = new Area(
                "After a short but very intense fight, J tells you \"Go to hell! Or better... stay at hell with your \n" +
                        "poorly drawn tigers, pigs and weasels\" and storms out your flat.\n",
                new int[]{10, 40},
                new String[]{
                        "1 - You throw on some clothes and run after her",
                        "2 - Exhausted you fall back on the couch"});
        areas[37] = new Area("", new int[]{}, new String[]{});
        areas[38] = new Area("", new int[]{}, new String[]{});
        areas[39] = new Area("", new int[]{}, new String[]{});
        areas[40] = new Area(
                "You somehow feel bad for how the evening went down. But no! You weren't the one changing plans last \n" +
                        "minute. And also... it's YOUR \"big\" day, isn't it? Let all of them bore themselves to death! At \n" +
                        "least J will be sorry for not having stayed home, after a few hours with this dimwits.\n" +
                        "Soon the movie has caught your full attention again and as always... as soon as the end credits \n" +
                        "roll you feel... hmmm... just content.\n" +
                        "But what's that? Something is glowing on the table, right next to your \"No.1 Party machine\"-coffee mug. \n" +
                        "J's phone. So storming out of the flat in a rage isn't the best party-preparation-strategy after all, huh..?\n",
                new int[]{41, 42},
                new String[]{
                        "1 - Look at the phone. You wanna know what important message J is missing",
                        "2 - Ignore the phone. Not you're problem. You're just looking forward to J calling when getting home \n" +
                                "    by Uber is going to be a problem without a phone"});
        areas[41] = new Area(
                "You grab the phone before the screen goes dark again and you read a text from Thomas \"Did it work?\n" +
                        "U alone?\".  \n" +
                        "The screen goes dark and so does your mind. \n" +
                        "\"Thomas?\" \n" +
                        "\"Thomas!\" \n" +
                        "\"THOMAS!!!\"\n" +
                        "Of course it's Thomas. You always knew it. This guy is just... But Jamie!? Why Jamie!? You didn't\n" +
                        "expect that. For seconds, minutes, hours (ok... it's only minutes) you can't do anything but sit in\n" +
                        "the dark and let the thoughts storm inside your head.\n",
                new int[]{44},
                new String[]{"1 - Sit in the dark and brood. Maybe cry a little."});
        areas[42] = new Area(
                "Two hours later the end credits of your movie marathon's second movie wake you up from your not so \n" +
                        "restful slumber - pillows wet from your drool. Maybe you picked the wrong movie... why in hell would \n" +
                        "they make another movie - same story, same characters, still animated but just not looking like it!? \n" +
                        "Waste of money and time. That's the last time you've watched this one. For sure. For a second you \n" +
                        "think about getting dressed and joining J at the party after all. But then you decide to go to bed. \n" +
                        "Friday's are just to exhausting and it's already past 11. While brushing your teeth you check your \n" +
                        "instagram. And there it is! All those stupid people on one picture. All of them holding balloons and \n" +
                        "wearing party hats but making sad faces. And J standing in the center, holding a cake with one hand \n" +
                        "and flipping the bird at the camera with the other. \"Surprise parties without the surprise guest suck! \n" +
                        "#partypooper #simbashouldhavedied\"\n",
                new int[]{43},
                new String[]{"1 - You turn off your phone"});
        areas[43] = new Area(
                "Phew! You really dodged a bullet there! Surprise party... what the heck!? So... Guess you could say\n" +
                        "\n" +
                        "!!!! YOU WON !!!!\n" +
                        "\n" +
                        "Or did you? Lying in bed you start thinking again... something's off about this Thomas. And why does \n" +
                        "he have his arm around Jamie? And whose phone did J post this picture on her IG from? But then sleep \n" +
                        "overcomes you and carries you away to Pride Rock where to new king is about to get crowned...\n");
        areas[44] = new Area(
                "But you can't just sit here alone and feel sorry for yourself forever! Well... or even a few\n" +
                        "minutes more. So you jump up, ready to make a decision.\n",
                new int[]{45, 46},
                new String[]{
                        "1 - Get drunk",
                        "2 - Go after J and try to catch her and Thomas in the act of betrayal. But actually you should give \n" +
                                "    them some time get comfortable together at the party. Too comfortable! Let them have some \n" +
                                "    drinks first. But then...\n" +
                                "    So why not have a few drinks yourself? Just to calm your nerves..."
                });
        areas[45] = new Area(
                "The first drink goes down fast and you immediately feel better. The second one is a bit slower and\n" +
                        "the storm behind your eyes starts brewing again. By the time you finish it, you're already agitated\n" +
                        "enough to decide, that it would be better to face Jamie and Thomas right now. \n" +
                        "So you get dressed and grab your keys. \n" +
                        "On your way out your eyes fall on Jamie's old baseball-bat hanging on the wall above your bedroom door.\n",
                new int[]{47, 48},
                new String[]{"1 - Your wonder if you still might be young enough to learn how to play baseball \n" +
                        "    and join some minor league team. But... doesn't matter now. You leave",
                        "2 - You grab the bat and hide it in your jacket. Then you leave"
                });
        areas[46] = new Area(
                "The first drink goes down fast and you immediately feel better. The second one is a bit slower and\n" +
                        "the storm behind your eyes starts brewing again. By the time you finish it, you're already agitated\n" +
                        "enough to decide, that it's time to face Jamie and Thomas. So you get dressed and grab your keys. \n" +
                        "On your way out your eyes fall on Jamie's old baseball-bat hanging on the wall above your bedroom door.\n",
                new int[]{47, 48},
                new String[]{"1 - Your wonder if you still might be young enough to learn how to play baseball \n" +
                        "    and join some minor league team. But... doesn't matter now. You leave",
                        "2 - You grab the bat and hide it in your jacket. Then you leave"
                });
        areas[47] = new Area("40 minutes later you are standing in front of Thomas' door. You had to wait down on the street for\n" +
                "10 minutes until this old lady with her ugly dog left the building, so you didn't have to ruin the \n" +
                "\"surprise\" by ringing the the bell and telling your name over the intercom. \n" +
                "You hear music and laughter (a lot of laughter) through the door. \"Well... that's gonna change soon\n" +
                "when this furious guest arrives\", you think to yourself.\n" +
                "You brace yourself for what's to come. So this is it. The final showdown. The battle at Pride Rock" +
                "for the stolen throne...\n",
                new int[]{50},
                new String[]{"1 - You give the door an angry knock"});
        areas[48] = new Area(
                "30 minutes later you get off your bicycle in front of Thomas' building. While locking the bike to a tree you\n" +
                        "recognise Thomas' car parking on the other side of the street. Hmmm... maybe you could just...\n",
                new int[]{55, 49},
                new String[]{"1 - You are here. The car is here. Jamie's bat is here. Can't be a coincident. \n" +
                        "    You get the bat out and cross the street",
                        "2 - Nah... not worth it. You go to the building and wait for someone to enter or exit \n" +
                                "    the door, so you can slip in"
                });
        areas[49] = new Area("God or Mufasa or whoever seems to be on your side. You only have to wait for 5 minutes until an\n" +
                "old lady with an ugly dog enters the building. You wait until the last moment before the door\n" +
                "shuts and slip in.\n" +
                "The baseball bat feels reassuring under your jacket. Or does it? What if you really have to swing\n" +
                "it and you miss and hurt your shoulder?\n" +
                "Maybe you could...\n" +
                "Yes! Hide it in the trash room! If you need it, you can still get it back. And if you don't... well\n" +
                "you would have to hope, Jamie won't miss it. While you're going up the stairs you start shaking.\n" +
                "Hmmm... must be cold in here.\n" +
                "When you reach Thomas' floor you go straight up to his door and knock at it almost immediately.\n",
                new int[]{50},
                new String[]{"1 - You give the door an angry knock"});
        areas[50] = new Area("Thomas opens the door - looking stupid with his stupid party hat on. But before you can even say or \n" +
                "do anything, he shouts out \"" + Player.getName() + "!\", turns around and runs away.\n" +
                "What a coward!\n" +
                "You take off your shoes and your jacket and slowly run after him. From your last visit you know, his\n" +
                "floor is always pretty slippery. (That's probably another reason you don't like him. He just\n" +
                "shouldn't have laughed so hard!)\n" +
                "As you enter the living room, you're thunderstruck. All of J's stupid friends are standing there. \n" +
                "Balloons in their hands and party hats on their heads. Only J, standing in the middle, is holding a cake.\n",
                new int[]{52},
                new String[]{"1 - You start to sweat"});
        areas[51] = new Area("", new int[]{}, new String[]{});
        areas[52] = new Area("After you have made your rounds, thanked everyone with your fake smile and tried a little bit of\n" +
                "smalltalk, you decide you are done with socialising. You just want to be left alone for the rest\n" +
                "of the evening and the last two persons you want to talk to are actually Thomas and Jamie.\n" +
                "But where to find some peace? Unfortunately it's still too early to go home. It's your part, isn't\n" +
                "it.\n" +
                "You look around for a place to hide. Maybe you could go upstairs? Nah... Thomas never lets anyone go upstairs \n" +
                "and the last thing you need is for him to follow you there.\n",
                new int[]{11, 11},
                new String[]{"1 - The chair over there in the corner is empty. Looks like a nice place to get drunk and ignore everyone",
                        "2 - It started to rain outside and none of the guests are smokers. Better get wet than talk to anyone"
        });
        areas[53] = new Area("", new int[]{}, new String[]{});
        areas[54] = new Area("", new int[]{}, new String[]{});
        areas[55] = new Area(
                "The first swing doesn't do much to the car. Those SKODAS really are built like tanks. Or could it\n" +
                        "have something to do with your baseball-bat-swinging-skills or whatever? The thought alone makes\n" +
                        "you even more furious.\n" +
                        "And so then second swing sends one exterior mirror flying. Now we're talking! Like Thor does his\n" +
                        "mighty hammer you swing the bat again and again. Nothing can stop you. Not the blaring car alarm,\n" +
                        "not the neighbors turning up behind their windows and watching you.\n" +
                        "As your arms get tired and you turn away from the poor car you see J, Thomas and all the other\n" +
                        "morons standing on the other side of the street. For a moment you can't help but grin about the\n" +
                        "stupid looks on their faces in contrast to the stupid party hats they all are wearing.\n" +
                        "But then you realize how you must look to them. A crazy person with a bat standing in the middle of \n" +
                        "the road, grinning like a psychopath.\n",
                new int[]{56, 56},
                new String[]{"1 - You turn around and start running away",
                            "2 - You drop the bat and stop walking towards Jamie"});
        areas[56] = new Area(
                "A police car comes round the corner stops right in front of you. Two pretty serious looking\n" +
                        "officers get out the car. Weapons in your hand. You immediately drop down to your knees, hands\n" +
                        "behind your head and close your eyes. Short version of this embarrassing situation:\n",
                new int[]{57},
                new String[]{"1 - You let the officers put you in the back of their car with as little resistance as possible"});
        areas[57] = new Area(
                "At the police station you sit on a very uncomfortable wooden chair. You feel pretty stupid. But\n" +
                        "you also feel lonely, tired, angry, sad and ...bored.\n" +
                        "So you get your phone out to distract yourself until one of the officers will come - presumably\n" +
                        "to apologize to you. After all - nothing that has happened is actually your fault.\n" +
                        "You check your instagram. And there it is! All those stupid people on one picture. All of them holding \n" +
                        "balloons and wearing party hats but making sad faces. And J standing in the center, holding a cake with \n" +
                        "one hand and flipping the bird at the camera with the other. \"Surprise parties without the surprise \n" +
                        "guest suck! #partypooper #simbashouldhavedied\" " +
                        "But the worst part actually is seeing Thomas with his arm around J. Looking somehow happy while trying\n" +
                        "to make his sad face...\n", new int[]{58}, new String[]{"1 - You turn off your phone"});
        areas[58] = new Area(
                "Well... that can only mean\n" +
                        "\n" +
                        "!!! YOU LOST !!!\n" +
                        "\n" +
                        "But try seeing it that way: at least there's now more surprises left for this evening, right?\n" +
                        "You look up and see an officer advancing. You straighten up to accept the coming apology with grace...\n",
                new int[]{},
                new String[]{});
        areas[59] = new Area("", new int[]{}, new String[]{});
        areas[60] = new Area("", new int[]{}, new String[]{});
        return areas;
    }
}
