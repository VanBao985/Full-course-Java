module org.example.fxprogressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxprogressbar to javafx.fxml;
    exports org.example.fxprogressbar;
}