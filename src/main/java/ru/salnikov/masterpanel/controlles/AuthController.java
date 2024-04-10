package ru.salnikov.masterpanel.controlles;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.salnikov.masterpanel.StartApplication;

import java.io.IOException;

public class AuthController {
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passField;

    @FXML
    protected void clickLogin() throws IOException {
        if (loginField != null && passField != null
                && loginField.getText().equals("user") && passField.getText().equals("pass")) {

            FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("main-page.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage currentStage = (Stage) passField.getScene().getWindow();
            currentStage.setTitle("main page");

            currentStage.setScene(scene);
            currentStage.show();
        }

    }
}