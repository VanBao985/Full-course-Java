package org.example.fxscenebuilder3;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
private Stage stage;
private Scene scene;
private FXMLLoader fxmlLoader;

public void switchtoScene1(ActionEvent event) throws IOException {
    fxmlLoader=new FXMLLoader(HelloApplication.class.getResource("Scene1.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(fxmlLoader.load());
    stage.setScene(scene);
    stage.show();
}
public void switchtoScene2(ActionEvent event) throws IOException {
    fxmlLoader=new FXMLLoader(HelloApplication.class.getResource("Scene2.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(fxmlLoader.load());
    stage.setScene(scene);
    stage.show();
}
}
