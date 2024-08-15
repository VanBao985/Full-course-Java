package org.example.fxcheckbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private ImageView myImageView;
    @FXML
    private Label myLabel;
    Image imageOff = new Image(getClass().getResourceAsStream("LightBulbOff.png"));
    Image imageOn = new Image(getClass().getResourceAsStream("LightBulbOn.png"));
    public void change (ActionEvent event){
        if(myCheckBox.isSelected()){
            myImageView.setImage(imageOn);
            System.out.println("On");
            myLabel.setText("ON!");
        }
        else {
            myImageView.setImage(imageOff);
            System.out.println("Off");
            myLabel.setText("OFF!");
        }
    }

}