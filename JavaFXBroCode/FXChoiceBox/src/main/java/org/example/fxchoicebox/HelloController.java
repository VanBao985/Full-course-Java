package org.example.fxchoicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String food[] = {"pizza", "sushi", "ramen"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::setMyLabel);
    }
    public void setMyLabel(ActionEvent event){
        String myString = myChoiceBox.getValue();
        myLabel.setText(myString);
    }
}