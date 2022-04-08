package com.example.assignment2gc200477892;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
//Use the Main class to launch the app.
public class Main extends Application {
    @Override
    /**
     * use the start method to set the fxml loader, title, icons, etc.
     */
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("drink-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome to Cocktail World");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4097/4097657.png"));
    }

    /**
     * Lunch the app by using this method.
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}

