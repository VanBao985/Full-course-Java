module org.example.fxscenebuilder2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxscenebuilder2 to javafx.fxml;
    exports org.example.fxscenebuilder2;
}