package org.example.fxspinner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Spinner<Integer> mySpinner;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myLabel.setText("Value!");
        SpinnerValueFactory<Integer> valueFactory
                = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
        valueFactory.setValue(1); // default value = 1
        mySpinner.setValueFactory(valueFactory);
        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                myLabel.setText(Integer.toString(mySpinner.getValue()));

            }
        });
    }
}