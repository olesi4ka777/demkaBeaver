module com.example.demkabeaver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.demkabeaver to javafx.fxml;
    exports com.example.demkabeaver;
}