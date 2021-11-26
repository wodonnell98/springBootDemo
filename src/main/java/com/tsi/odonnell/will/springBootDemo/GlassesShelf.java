package com.tsi.odonnell.will.springBootDemo;

import com.google.gson.Gson;

import java.util.ArrayList;

public class GlassesShelf {

    private ArrayList<CocktailGlass> glassesShelf = new ArrayList<CocktailGlass>();

    public GlassesShelf(){
        this.glassesShelf.add(new CocktailGlass("G1", "Mojito", 380));
        this.glassesShelf.add(new CocktailGlass("G2", "Martini", 170));
        this.glassesShelf.add(new CocktailGlass("G3", "Pina Colada", 375));
        this.glassesShelf.add(new CocktailGlass("G4", "Sling", 310));
        this.glassesShelf.add(new CocktailGlass("G5", "Shot", 44));
    }

    public String toString(){
        String json = new Gson().toJson(glassesShelf);
                return json;
    }

}
