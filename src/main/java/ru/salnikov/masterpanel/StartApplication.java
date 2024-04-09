package ru.salnikov.masterpanel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class StartApplication extends Application {

    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException, SQLException {

        //conn = null;
        //Class.forName("org.sqlite.JDBC");
        //conn = DriverManager.getConnection("jdbc:sqlite:MasterPanelDB.s3db");

        System.out.println("База Подключена!");
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("login-panel.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("login panel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}