package org.example.fxanimation;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.RotateEvent;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView myImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*
        // translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImageView);
        translate.setByX(500);
        translate.setDuration(Duration.seconds(0.5));
        translate.setCycleCount(20);
        translate.setAutoReverse(true);
        translate.play();
        */
        /*
        //rotate
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(myImageView);
        rotate.setDuration(Duration.seconds(0.5));
//        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setCycleCount(20);
        rotate.setByAngle(360);
        rotate.play();
         */
        /*
        // fade
        FadeTransition fade = new FadeTransition();
        fade.setNode(myImageView);
        fade.setDuration(Duration.seconds(0.5));
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setCycleCount(FadeTransition.INDEFINITE);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();
         */
        // scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImageView);
        scale.setDuration(Duration.seconds(0.5));
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setCycleCount(FadeTransition.INDEFINITE);
        scale.setByX(2.0); scale.setByY(2.0);
        scale.setAutoReverse(true);
        scale.play();
        
    }
}