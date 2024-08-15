package org.example.fxkeyevent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        HelloController helloController = fxmlLoader.getController();
        Scene scene=new Scene(root);

        scene.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()){
                case W:
                    helloController.moveUp();
                    break;
                case S:
                    helloController.moveDown();
                    break;
                case A:
                    helloController.moveLeft();
                    break;
                case D:
                    helloController.moveRight();
                    break;
                default:
                    break;
            }
        });
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}