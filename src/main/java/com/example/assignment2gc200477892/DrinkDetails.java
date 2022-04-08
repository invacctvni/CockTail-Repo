package com.example.assignment2gc200477892;

import com.google.gson.annotations.SerializedName;

public class DrinkDetails {
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

    @SerializedName("strInstructionsDE")
    private String instructionsDE;

    @SerializedName("strDrinkThumb")
    private String photo;

    @SerializedName("strIngredient1")
    private String ingredient1;

}
