module org.example.fxcolorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxcolorpicker to javafx.fxml;
    exports org.example.fxcolorpicker;
}