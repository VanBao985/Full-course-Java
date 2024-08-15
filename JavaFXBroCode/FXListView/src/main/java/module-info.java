module org.example.fxlistview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxlistview to javafx.fxml;
    exports org.example.fxlistview;
}