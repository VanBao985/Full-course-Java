module org.example.fxslider {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxslider to javafx.fxml;
    exports org.example.fxslider;
}