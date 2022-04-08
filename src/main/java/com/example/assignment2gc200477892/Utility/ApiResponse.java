package com.example.assignment2gc200477892.Utility;

import com.example.assignment2gc200477892.Model.Drink;
import com.google.gson.annotations.SerializedName;

public class ApiResponse {

    @SerializedName("drinks")
    private Drink[] drinks;

    public Drink[] getDrinks() {
        return drinks;
    }
}
