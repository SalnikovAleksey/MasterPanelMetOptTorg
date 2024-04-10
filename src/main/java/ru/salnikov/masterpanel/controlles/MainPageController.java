package ru.salnikov.masterpanel.controlles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
import ru.salnikov.masterpanel.StartApplication;

import java.io.IOException;

public class MainPageController {

    @FXML
    MenuBar menuBar;

    @FXML
    protected void deliveryClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("delivery-page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage currentStage = (Stage) menuBar.getScene().getWindow();
        currentStage.setTitle("delivery page");
        currentStage.setScene(scene);

        currentStage.show();
    }

    public void exportClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("export-page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage currentStage = (Stage) menuBar.getScene().getWindow();
        currentStage.setTitle("export page");
        currentStage.setScene(scene);

        currentStage.show();
    }

    public void balanceClick(ActionEvent actionEvent) throws IOException {
        System.out.println("В разработке");
    }

    public void recyclingClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("recycling-page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage currentStage = (Stage) menuBar.getScene().getWindow();
        currentStage.setTitle("Recycling page");
        currentStage.setScene(scene);

        currentStage.show();
    }
}
