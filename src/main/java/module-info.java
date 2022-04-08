module com.example.assignment2gc200477892 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.assignment2gc200477892 to javafx.fxml, com.google.gson;
    exports com.example.assignment2gc200477892;
    exports com.example.assignment2gc200477892.Utility;
    opens com.example.assignment2gc200477892.Utility to com.google.gson, javafx.fxml;
    exports com.example.assignment2gc200477892.Controllers;
    opens com.example.assignment2gc200477892.Controllers to com.google.gson, javafx.fxml;
    exports com.example.assignment2gc200477892.Model;
    opens com.example.assignment2gc200477892.Model to com.google.gson, javafx.fxml;
}