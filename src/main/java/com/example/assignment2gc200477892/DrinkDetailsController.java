package com.example.assignment2gc200477892;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class DrinkDetailsController {

    @FXML
    private Label IngredientLabel;

    @FXML
    private Label alcoholLabel;

    @FXML
    private Label categoryLabel;

    @FXML
    private Label drinkTitleLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<String> ingredientListView;

    @FXML
    private Label instructionLabel;

    private DrinkDetails drink;

    /**
     * This method will load drink id.
     */
    public void loadDrinkDetails(String drinkId)
    {
        System.out.println("The drink Id pass into the controller is: " + drinkId);
//        drink = APIUtility.getDrinkDetails(drinkId);

    }
}
