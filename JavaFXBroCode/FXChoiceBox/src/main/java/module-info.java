module org.example.fxchoicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxchoicebox to javafx.fxml;
    exports org.example.fxchoicebox;
}