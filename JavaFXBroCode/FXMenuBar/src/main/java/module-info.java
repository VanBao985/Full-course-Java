module org.example.fxmenubar {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxmenubar to javafx.fxml;
    exports org.example.fxmenubar;
}