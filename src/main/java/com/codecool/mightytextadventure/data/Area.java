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
    //TODO: take index from input instead of word
        if (options.length == 0) {
            return 0;
        } else if (playerChoice > options.length || playerChoice <= 0) {
            return -1;
        }
        return options[playerChoice - 1];
    }

    public String toString(){
        String areaDescription = description + "\n";
        for (String text: optionsText) {
            areaDescription += "\t" + text;
        }
        return areaDescription;
    }
}
