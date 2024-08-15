module org.example.fxscenebuilder3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxscenebuilder3 to javafx.fxml;
    exports org.example.fxscenebuilder3;
}