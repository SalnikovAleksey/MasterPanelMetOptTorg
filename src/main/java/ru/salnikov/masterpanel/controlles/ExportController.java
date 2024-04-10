package ru.salnikov.masterpanel.controlles;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
}
