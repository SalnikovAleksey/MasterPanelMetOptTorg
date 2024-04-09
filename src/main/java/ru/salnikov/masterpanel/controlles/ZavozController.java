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

public class ZavozController implements Initializable {

    @FXML
    public MenuBar menuBar;
    public DatePicker datePicker;
    public MenuButton menuButton;
    public Button okButton;
    public TextField textFieldVes;
    public TableView<Materials> table;

    static ObservableList<Materials> materialsList;
    public TableColumn<Materials, Integer> number;
    public TableColumn<Materials, String> nomenclatura;
    public TableColumn<Materials, Integer> ves;
    public TableColumn<Materials, String> date;

    MenuItem menuItem1 = new MenuItem("Труба Incoloy 800");
    MenuItem menuItem2 = new MenuItem("Кабель б/у");

    static {
        materialsList = FXCollections.observableArrayList(
                new Materials(1, "Incoloy 800", 1250, "12-03-2024"),
                new Materials(2, "Incoloy 800", 640, "14-05-2024"),
                new Materials(3, "Кабель б/у", 2300, "22-05-2024")
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
        menuButton.setText("Номенклатура");
        //Materials newMat = new Materials(materialsList.toArray().length, ) TODO сделать добавление новой позиции
    }

    public void incoloy800(ActionEvent actionEvent) {
        menuButton.setText("Труба Incoloy 800");
    }

    public void cablebu(ActionEvent actionEvent) {
        menuButton.setText("Кабель б/у");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //TODO Привести код в норму
        number.setCellValueFactory(new PropertyValueFactory<Materials, Integer>("number"));
        nomenclatura.setCellValueFactory(new PropertyValueFactory<Materials, String>("nomenclatura"));
        ves.setCellValueFactory(new PropertyValueFactory<Materials, Integer>("ves"));
        date.setCellValueFactory(new PropertyValueFactory<Materials, String>("date"));
        table.setItems(materialsList);
    }
}
