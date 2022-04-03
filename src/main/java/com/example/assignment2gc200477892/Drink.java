package com.example.assignment2gc200477892;

import com.google.gson.annotations.SerializedName;

public class Drink {
    @SerializedName("strDrink")
    private String name;

    @SerializedName("strCategory")
    private String category;

    @SerializedName("strAlcoholic")
    private String alcohol;

    @SerializedName("strInstructions")
    private String instructions;

    @SerializedName("strInstructionsDE")
    private String instructionsDE;

    @SerializedName("strDrinkThumb")
    private String photo;

    @SerializedName("strIngredient1")
    private String ingredient1;

    @SerializedName("strIngredient2")
    private String ingredient2;

    @SerializedName("strIngredient3")
    private String ingredient3;

    @SerializedName("strIngredient4")
    private String getIngredient4;

    @SerializedName("strIngredient5")
    private String getIngredient5;

    @SerializedName("strIngredient6")
    private String getIngredient6;

    @SerializedName("strIngredient7")
    private String getIngredient7;

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

    public String getInstructionsDE() {
        return instructionsDE;
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

    public String getGetIngredient4() {
        return getIngredient4;
    }

    public String getGetIngredient5() {
        return getIngredient5;
    }

    public String getGetIngredient6() {
        return getIngredient6;
    }

    public String getGetIngredient7() {
        return getIngredient7;
    }
}
