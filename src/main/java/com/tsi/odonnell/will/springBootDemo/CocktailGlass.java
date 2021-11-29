package com.tsi.odonnell.will.springBootDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CocktailGlass {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int id;

    private String type;
    private int volume;
    private String glassID;

    public CocktailGlass(){}

    public CocktailGlass(String glassID, String type, int volume){
        this.glassID = glassID;
        this.type = type;
        this.volume = volume;
    }

@Override
    public String toString(){       //Make into json
      return "Glass ID is" + " " + id +
              "." + " " +
              "Glass type is" + " " + type +
              "." + " " +
              "Glass volume is" + " " + volume + ".";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGlassID() {
        return glassID;
    }

    public void setGlassID(String glassID) {
        this.glassID = glassID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
