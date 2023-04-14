package com.codecool.mightytextadventure.data;

public class Area {
    public static final int INVALID_DIRECTION = -1;
    private final String description;
    private final int[] areaIndex;
    private final String[] optionMessages;


    public Area(String description) {
        this.description = description;
        areaIndex = new int[0];
        optionMessages = new String[0];
    }

    public Area(String description, int[] areaIndexes, String[] optionMessages) {
        this.description = description;
        this.areaIndex = areaIndexes;
        this.optionMessages = optionMessages;
    }

    public int getDirection(Integer playerChoice) {
        if (isChoicePossible(playerChoice)) {
            return areaIndex[playerChoice - 1];
        }
        return INVALID_DIRECTION;
    }

    private boolean isChoicePossible(Integer playerChoice) {
        return playerChoice <= areaIndex.length && playerChoice > 0;
    }

    public String toString() {
        String areaDescription = "\n" + description;
        for (String message : optionMessages) {
            areaDescription += "\n" + message;
        }
        return areaDescription;
    }

    public boolean isEnd() {
        return areaIndex.length == 0;
    }
}
