package com.codecool.mightytextadventure.data;

public class Area {
    private final String description;
    private int[] options;
    private String[] optionsText;



    public Area(String description) {
        this.description = description;
        options = new int[0];
        optionsText = new String[0];
    }

    public Area(String description, int[] options, String[] optionsText) {
        this.description = description;
        this.options = options;
        this.optionsText = optionsText;
    }

    public String getDescription() {
        return description;
    }


    public int getDirection(Integer playerChoice) {
        if (isPossibleChoice(playerChoice)) {
            return options[playerChoice - 1];
        }
        return -1;
    }

    private boolean isPossibleChoice(Integer playerChoice) {
        return (playerChoice <= options.length && playerChoice > 0);
    }

    public String toString(){
        String areaDescription = description + "\n";
        for (String text: optionsText) {
            areaDescription += text + "\t";
        }
        return areaDescription + ": ";
    }

    public boolean isEnd() {
        return options.length == 0;
    }
}
