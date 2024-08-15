module org.example.fximageview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fximageview to javafx.fxml;
    exports org.example.fximageview;
}