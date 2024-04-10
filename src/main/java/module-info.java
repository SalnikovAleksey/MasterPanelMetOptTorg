module ru.salnikov.masterpanel {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens ru.salnikov.masterpanel to javafx.fxml;
    exports ru.salnikov.masterpanel;
    exports ru.salnikov.masterpanel.controlles;
    opens ru.salnikov.masterpanel.controlles to javafx.fxml;
    exports ru.salnikov.masterpanel.entity;
    opens ru.salnikov.masterpanel.entity to javafx.fxml;
}