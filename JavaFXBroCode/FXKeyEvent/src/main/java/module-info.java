module org.example.fxkeyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxkeyevent to javafx.fxml;
    exports org.example.fxkeyevent;
}