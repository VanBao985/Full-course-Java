package org.example.fxdatepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private DatePicker myDatePicker;
    public void getDate(ActionEvent event){
        LocalDate localDate = myDatePicker.getValue();
        String myFormattedDate = localDate.format(DateTimeFormatter.ofPattern("MMM-dd-yy"));
        myLabel.setText(myFormattedDate);
    }
}