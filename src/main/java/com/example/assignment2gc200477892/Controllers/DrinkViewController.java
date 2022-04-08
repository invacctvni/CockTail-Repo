package com.example.assignment2gc200477892.Controllers;

import com.example.assignment2gc200477892.Model.Drink;
import com.example.assignment2gc200477892.Utility.APIUtility;
import com.example.assignment2gc200477892.Utility.ApiResponse;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class DrinkViewController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<Drink> resultListView;

    @FXML
    private Button getInfoButton;

    @FXML
    private Label homePageLabel;

    /**
     * This method will fetch the data from URL.
     */
    @FXML
    private void searchResults()
    {
        System.out.println(resultListView.getItems().size());
        homePageLabel.setText("Pick One Below to See the Image.");
        homePageLabel.setStyle("-fx-text-fill: linear-gradient(greenyellow,deepskyblue)");
        //prevent multiple loading repeated rows of data.
        if (resultListView.getItems().size() == 0) {
            ApiResponse apiResponse = APIUtility.getObjectsFromWebQuick();
            resultListView.getItems().addAll(apiResponse.getDrinks());
        }
    }

    /**
     * This method will initialize the home scene.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //make info button invisible first.
        getInfoButton.setVisible(false);
        homePageLabel.setStyle("-fx-text-fill: linear-gradient(coral,lightskyblue)");
        homePageLabel.setText("Welcome. Click Start to view different kinds of cocktails");
        homePageLabel.setAlignment(Pos.CENTER);
        imageView.setEffect(new DropShadow(20,Color.ORANGE));
        //add listener to add photos.
        resultListView.getSelectionModel().selectedItemProperty().addListener(
                (obs,oldObjectSelected,newObjectSelected) -> {
                    getInfoButton.setVisible(true);
                    homePageLabel.setStyle("-fx-text-fill: linear-gradient(greenyellow,#be1d00);");
                    homePageLabel.setText("Click More to Explore " + newObjectSelected.getName());
                    try {
                        imageView.setImage(new Image(newObjectSelected.getPhoto()));
                    }
                    catch (IllegalArgumentException e) {
                        imageView.setImage(new Image("https://trailerfailure.com/img/images/missingCoverPhoto.jpg"));
                    }
                    });
    }

    /**
     * Pass the Imdb info to the details' scene.
     */
    @FXML
    private void getDetails(ActionEvent event) throws IOException {
        //get selected item's information
        String idDrink = resultListView.getSelectionModel().getSelectedItem().getIdDrink();
        String name = resultListView.getSelectionModel().getSelectedItem().getName();
        String category = resultListView.getSelectionModel().getSelectedItem().getCategory();
        String alcohol = resultListView.getSelectionModel().getSelectedItem().getAlcohol();
        List<String> ingredient = resultListView.getSelectionModel().getSelectedItem().getIngredientsAll();
        String instruction = resultListView.getSelectionModel().getSelectedItem().getInstructions();
        String photo = resultListView.getSelectionModel().getSelectedItem().getPhoto();
        SceneChanger.changeScenes(event,"drink-details.fxml",idDrink,name,category,alcohol,ingredient,instruction,photo);

    }
}
