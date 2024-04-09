package ru.salnikov.masterpanel.controlles;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.salnikov.masterpanel.StartApplication;

import java.io.IOException;

public class MainPageController {

    @FXML
    MenuBar menuBar;

    @FXML
    protected void zavozClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("delivery-page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage currentStage = (Stage) menuBar.getScene().getWindow();
        currentStage.setTitle("delivery page");
        currentStage.setScene(scene);

        currentStage.show();
    }
}
