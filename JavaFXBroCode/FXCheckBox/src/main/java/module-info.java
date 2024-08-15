module org.example.fxcheckbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxcheckbox to javafx.fxml;
    exports org.example.fxcheckbox;
}