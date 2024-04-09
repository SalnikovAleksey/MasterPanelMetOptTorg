package ru.salnikov.masterpanel.controlles;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ru.salnikov.masterpanel.Materials;
import ru.salnikov.masterpanel.StartApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DeliveryController implements Initializable {

    @FXML
    public MenuBar menuBar;
    public DatePicker datePicker;
    public MenuButton menuButton;
    public Button okButton;
    public TextField textFieldVes;
    public TableView<Materials> table;

    static ObservableList<Materials> materialsList;
    public TableColumn<Materials, Integer> number;
    public TableColumn<Materials, String> nomenclature;
    public TableColumn<Materials, Integer> weight;
    public TableColumn<Materials, String> date;

    private Integer numberInTable = 0;

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

        if (materialsList != null && !menuButton.getText().equals("Номенклатура")) {
            numberInTable++;
            materialsList.add(new Materials(
                    numberInTable,
                    menuButton.getText(),
                    Integer.parseInt(textFieldVes.getText()),
                    datePicker.getValue().toString()
            ));
        }
        menuButton.setText("Номенклатура");
    }


    public void incoloy800(ActionEvent actionEvent) {
        menuButton.setText("Труба Incoloy 800");
    }

    public void cablebu(ActionEvent actionEvent) {
        menuButton.setText("Кабель б/у");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //TODO Привести код в норму
        materialsList = FXCollections.observableArrayList();
        number.setCellValueFactory(new PropertyValueFactory<Materials, Integer>("number"));
        nomenclature.setCellValueFactory(new PropertyValueFactory<Materials, String>("nomenclature"));
        weight.setCellValueFactory(new PropertyValueFactory<Materials, Integer>("weight"));
        date.setCellValueFactory(new PropertyValueFactory<Materials, String>("date"));
        table.setItems(materialsList);
    }
}
