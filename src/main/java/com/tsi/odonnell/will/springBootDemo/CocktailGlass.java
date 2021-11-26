package com.tsi.odonnell.will.springBootDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CocktailGlass {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private String id;

    private String type;
    private int volume;

    public CocktailGlass(String id, String type, int volume){
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
