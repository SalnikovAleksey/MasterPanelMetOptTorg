package ru.salnikov.masterpanel.controlles;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ru.salnikov.masterpanel.Materials;
import ru.salnikov.masterpanel.StartApplication;

import java.io.IOException;

public class ZavozController {

    @FXML
    public MenuBar menuBar;
    public DatePicker datePicker;
    public MenuButton menuButton;
    public Button okButton;
    public TextField textFieldVes;
    public TableView<Materials> table;

    static ObservableList<Materials> materialsList;

    MenuItem menuItem1 = new MenuItem("Труба Incoloy 800");
    MenuItem menuItem2 = new MenuItem("Кабель б/у");

    static {
        materialsList = FXCollections.observableArrayList(
                new Materials(1, "Incoloy 800",1250, "12-03-2024"),
                new Materials(2, "Incoloy 800",640, "14-05-2024"),
                new Materials(3, "Кабель б/у",2300, "22-05-2024")
        );
    }
    @FXML
    protected void backClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("main-page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage currentStage = (Stage) menuBar.getScene().getWindow();
        currentStage.setTitle("main page");

        currentStage.setScene(scene);
        currentStage.show();
    }

    public void datePick(ActionEvent actionEvent) {
    }

    public void okButtonClick(ActionEvent actionEvent) {
        System.out.println(datePicker.getValue());
        System.out.println(textFieldVes.getText());
        System.out.println(menuButton.getText());
        menuButton.setText("Номенклатура");


    }

    public void incoloy800(ActionEvent actionEvent) {
        menuButton.setText("Труба Incoloy 800");
    }

    public void cablebu(ActionEvent actionEvent) {
        menuButton.setText("Кабель б/у");
    }
}
