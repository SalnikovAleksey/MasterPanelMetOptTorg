package ru.salnikov.masterpanel.controlles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import ru.salnikov.masterpanel.StartApplication;

import java.io.IOException;

public class ExportController {
    @FXML
    public MenuBar menuBar;
    public DatePicker datePicker;
    public MenuButton menuButton;

    @FXML
    public MenuItem aluminumMenu;
    public MenuItem copperPureClick;
    public MenuItem copperDirtyClick;
    public MenuItem steelArmorClick;
    public MenuItem steelVeinClick;
    public MenuItem garbageClick;
    public MenuItem pvcClick;

    @FXML
    public TextField textFieldWeight;
    public Button okButton;

    @FXML
    public TableView table;
    public TableColumn number;
    public TableColumn nomenclature;
    public TableColumn weight;
    public TableColumn date;
    public Button deleteButton;
    public TextField textFieldTaskId;

    public void backClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("main-page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        Stage currentStage = (Stage) menuBar.getScene().getWindow();
        currentStage.setTitle("main page");

        currentStage.setScene(scene);
        currentStage.show();
    }

    public void aluminumClick(ActionEvent actionEvent) {
    }

    public void copperPure(ActionEvent actionEvent) {
    }

    public void copperDirty(ActionEvent actionEvent) {
    }

    public void steelArmor(ActionEvent actionEvent) {
    }

    public void steelVein(ActionEvent actionEvent) {
    }

    public void garbage(ActionEvent actionEvent) {
    }

    public void Pvc(ActionEvent actionEvent) {
    }

    public void okButtonClick(ActionEvent actionEvent) {
    }

    public void datePick(ActionEvent actionEvent) {
    }

    public void deleteButtonClick(ActionEvent actionEvent) {
    }
}
