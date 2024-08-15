module org.example.fxdatepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxdatepicker to javafx.fxml;
    exports org.example.fxdatepicker;
}