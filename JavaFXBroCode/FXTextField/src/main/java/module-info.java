module org.example.fxtextfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxtextfield to javafx.fxml;
    exports org.example.fxtextfield;
}