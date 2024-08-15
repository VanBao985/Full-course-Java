package org.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.PINK);
        stage.setScene(scene);
        stage.setTitle("Stage Demo Program w00t w00t.");
//        Image icon = new Image("src/main/java/org/example/hellofx/icon.png");
//        stage.getIcons().add(icon);
        stage.setWidth(720);
        stage.setHeight(590);
        stage.setResizable(false);
//        stage.setX(500);
//        stage.setY(100);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }
}