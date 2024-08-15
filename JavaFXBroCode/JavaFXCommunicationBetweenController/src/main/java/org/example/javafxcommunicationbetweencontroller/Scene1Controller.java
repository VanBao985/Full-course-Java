package org.example.javafxcommunicationbetweencontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException{
        String userName = nameTextField.getText();
        String yourAge = ageTextField.getText();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = fxmlLoader.load();
        Scene2Controller scene2Controller = fxmlLoader.getController();
        scene2Controller.displayName(userName);
        scene2Controller.displayAge(yourAge);

        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
//        String css = this.getClass().getResource("application.css").toExternalForm();
//        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }
}
