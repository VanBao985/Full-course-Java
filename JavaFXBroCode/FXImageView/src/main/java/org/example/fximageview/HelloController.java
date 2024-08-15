package org.example.fximageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    // ImageView is a Node used for painting images loaded with Images
    // Image = photograph
//    // ImageView = picture frame
    @FXML
    Button myButton;
    @FXML
    ImageView myImageView;
    Image myImage = new Image(getClass().getResourceAsStream("sherk2.jpg"));
    public void displayImage(){
        myImageView.setImage(myImage);
    }
}