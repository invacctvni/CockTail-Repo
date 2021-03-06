package com.example.assignment2gc200477892.Controllers;

import com.example.assignment2gc200477892.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

/**
 * Call a method to pass in the FXML file to load.
 */
public class SceneChanger {

    public static void changeScenes(ActionEvent event, String fxmlFile, String drinkId, String name, String category, String alcohol, List<String> ingredient, String instruction, String photo) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
//get the controller from the destination
        DrinkDetailsController controller = fxmlLoader.getController();
        //pass in id.
        controller.loadDrinkDetails(name, category, alcohol, ingredient, instruction, photo);

//        get the stage object from the action event triggered when button was pushed.
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Detailed Cocktail View");
        stage.getIcons().clear();
        stage.getIcons().add(new Image(photo));
    }

    /**
     * This method is used to change to the home scene.
     * @param event
     * @param fxmlFile
     * @throws IOException
     */
    public static void changeScenesHome(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Welcome to Cocktail World");
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4097/4097657.png"));
    }
}
