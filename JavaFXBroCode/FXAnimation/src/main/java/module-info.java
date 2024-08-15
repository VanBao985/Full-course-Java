module org.example.fxanimation {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxanimation to javafx.fxml;
    exports org.example.fxanimation;
}