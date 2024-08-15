module org.example.fxradiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxradiobutton to javafx.fxml;
    exports org.example.fxradiobutton;
}