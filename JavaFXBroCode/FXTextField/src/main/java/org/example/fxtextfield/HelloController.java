package org.example.fxtextfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Label errorLabel;
    @FXML
    private Button myButton;

    int age;
    public void submit(ActionEvent event){
         try {
            age=Integer.parseInt(myTextField.getText());
            if(age>=18){
                errorLabel.setText("You are now signed up!");
            }
            else {
                errorLabel.setText("You must be 18+");
            }
        }
         catch (NumberFormatException e){
             errorLabel.setText("Only input number, please!");
         }
         catch (Exception e){
             errorLabel.setText("Value error!");
         }
    }
}
