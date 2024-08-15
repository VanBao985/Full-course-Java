module org.example.fxtreeview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fxtreeview to javafx.fxml;
    exports org.example.fxtreeview;
}