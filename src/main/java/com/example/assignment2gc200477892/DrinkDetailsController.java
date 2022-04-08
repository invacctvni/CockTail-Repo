package com.example.assignment2gc200477892;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;

public class DrinkDetailsController {

    @FXML
    private Label ingredientLabel;

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
    public void loadDrinkDetails(String drinkId, String name, String category, String alcohol, List<String> ingredient, String instruction, String photo)
    {
        System.out.println("The drink Id pass into the controller is: " + drinkId + category + alcohol + ingredient + instruction);
        ingredientLabel.setText(ingredient.get(0));
        alcoholLabel.setText(alcohol);
        categoryLabel.setText(category);
        drinkTitleLabel.setText(name);
        instructionLabel.setText(instruction);
        imageView.setImage(new Image(photo));
        ingredientListView.getItems().addAll(ingredient);
    }
}
