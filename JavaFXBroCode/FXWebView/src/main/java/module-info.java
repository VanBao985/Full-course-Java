module org.example.fxwebview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxwebview to javafx.fxml;
    exports org.example.fxwebview;
}