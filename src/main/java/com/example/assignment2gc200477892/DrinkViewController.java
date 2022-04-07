package com.example.assignment2gc200477892;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DrinkViewController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<Drink> resultListView;

    @FXML
    private Button searchButton;

    @FXML
    private Button getInfoButton;

    @FXML
    private void searchResults()
    {
        System.out.println(resultListView.getItems().size());
        //prevent multiple loading repeated rows of data.
        if (resultListView.getItems().size() == 0) {
            ApiResponse apiResponse = APIUtility.getObjectsFromWebQuick();
            resultListView.getItems().addAll(apiResponse.getDrinks());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //make info button invisible first.
        getInfoButton.setVisible(false);

        //add listener to add photos.
        resultListView.getSelectionModel().selectedItemProperty().addListener(
                (obs,oldObjectSelected,newObjectSelected) -> {
                    getInfoButton.setVisible(true);
                    try {
                        imageView.setImage(new Image(newObjectSelected.getPhoto()));
                    }
                    catch (IllegalArgumentException e) {
                        imageView.setImage(new Image("https://trailerfailure.com/img/images/missingCoverPhoto.jpg"));
                    }
                    });
    }

    /**
     * Pass the Imdb info to the movie details controller.
     */
    @FXML
    private void getDetails(ActionEvent event) throws IOException {
        String idDrink = resultListView.getSelectionModel().getSelectedItem().getIdDrink();
//        System.out.println(idDrink);
        SceneChanger.changeScenes(event,"drink-details.fxml");
    }
}
