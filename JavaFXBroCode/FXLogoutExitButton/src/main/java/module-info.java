module org.example.fxlogoutexitbutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxlogoutexitbutton to javafx.fxml;
    exports org.example.fxlogoutexitbutton;
}