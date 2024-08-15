package org.example.javafxcommunicationbetweencontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    Label textLabelName;
    @FXML
    Label textLabelAge;
    public void displayName(String userName){
        textLabelName.setText("User Name: " + userName);
    }
    public void displayAge(String yourAge){
        textLabelAge.setText("Age: "+ yourAge);
    }
}
