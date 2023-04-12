package com.codecool.mightytextadventure.data;

import java.util.ArrayList;

public class Player {
    private String name;
    private Area area;
    private ArrayList<String> items;


    public Player(String name, Area area, ArrayList<String> items) {
        this.name = name;
        this.area = area;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Area getArea() {
        return area;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setItems(ArrayList<String> items) {
         this.items = items;
    }

}
