module org.example.fxscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxscenebuilder to javafx.fxml;
    exports org.example.fxscenebuilder;
}