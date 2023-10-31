package com.example.demkabeaver;
import java.sql.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        SQLExperiment ex = new SQLExperiment();
        ex.testConnection();
    }
}