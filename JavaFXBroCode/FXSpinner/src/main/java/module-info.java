module org.example.fxspinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxspinner to javafx.fxml;
    exports org.example.fxspinner;
}