package com.example.assignment2gc200477892.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.io.IOException;
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
    private TextArea instructionArea;

    /**
     * This method will load drink id.
     */
    public void loadDrinkDetails(String drinkId, String name, String category, String alcohol, List<String> ingredient, String instruction, String photo)
    {
        ingredientLabel.setText(ingredient.get(0));
        alcoholLabel.setText(alcohol);
        categoryLabel.setText(category);
        drinkTitleLabel.setText(name);
        instructionArea.setText(instruction);
        instructionArea.setEditable(false);
        instructionArea.setWrapText(true);
        imageView.setEffect(new DropShadow(30, Color.GREENYELLOW));
        imageView.setImage(new Image(photo));
        ingredientListView.getItems().addAll(ingredient);
        ingredientListView.setStyle("-fx-background-image: none");
    }

    /**
     * This method will load the home scene.
     * @param event
     * @throws IOException
     */
    @FXML
    public void loadHome(ActionEvent event) throws IOException {
        SceneChanger.changeScenesHome(event,"drink-view.fxml");

    }
}
