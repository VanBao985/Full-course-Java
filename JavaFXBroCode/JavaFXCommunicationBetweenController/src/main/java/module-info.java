module org.example.javafxcommunicationbetweencontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxcommunicationbetweencontroller to javafx.fxml;
    exports org.example.javafxcommunicationbetweencontroller;
}