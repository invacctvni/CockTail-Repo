package com.example.assignment2gc200477892.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    //create the selected instance variables.
    @SerializedName("idDrink")
    private String idDrink;

    @SerializedName("strDrink")
    private String name;

    @SerializedName("strCategory")
    private String category;

    @SerializedName("strAlcoholic")
    private String alcohol;

    @SerializedName("strInstructions")
    private String instructions;

    @SerializedName("strDrinkThumb")
    private String photo;

    @SerializedName("strIngredient1")
    private String ingredient1;

    @SerializedName("strIngredient2")
    private String ingredient2;

    @SerializedName("strIngredient3")
    private String ingredient3;

    @SerializedName("strIngredient4")
    private String ingredient4;

    @SerializedName("strIngredient5")
    private String ingredient5;

    public String getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getPhoto() {
        return photo;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }

    public String getIngredient4() {
        return ingredient4;
    }

    public String getIngredient5() {
        return ingredient5;
    }

    /**
     *     Use this method to combine all the ingredients
      */

    public List<String> getIngredientsAll() {
        String[] combined;
        combined = new String[]{ingredient1, ingredient2, ingredient3, ingredient4, ingredient5};
        int i = 0;
        List<String> ingredientsFinal = new ArrayList<String>();
        while(i<combined.length) {
            if(combined[i]!=null) {
                ingredientsFinal.add(combined[i]);
            }
            i++;
        }
        return ingredientsFinal;
    }

    /**
     * Use the toString method to format the result and get the cocktail name.
     * @return
     */
    public String toString () {
        return String.format("%s", name);
    }
}
