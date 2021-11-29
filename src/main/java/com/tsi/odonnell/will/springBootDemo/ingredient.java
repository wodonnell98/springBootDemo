package com.tsi.odonnell.will.springBootDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int ingredientID;

    private String Name;


    public ingredient() {
    }

    public ingredient(String Name) {
        this.Name = Name;
    }





    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
