package org.example.fxprogressbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ProgressBar myProgressBar;
    @FXML
    private Button myButton;
    // The BigDecimal class gives its user complete control over rounding behavior
    BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressBar.setStyle("-fx-accent: yellow;");
    }
    public void increaseProgress(){
        if (progress.doubleValue() < 1){
            progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
            System.out.println(progress);
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString((int) Math.round(progress.doubleValue() * 100)) + "%");
            // Math.round: lam tron ve so nguyen gan nhat
        }
    }
}