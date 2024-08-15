package org.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,600, 600, Color.LIGHTSKYBLUE);
        Text text = new Text();
        text.setText("WHOOOOOOA!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Montserrat", 50));
        text.setFill(Color.MINTCREAM);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(25);
        line.setStroke(Color.CHOCOLATE);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);       rectangle.setY(350);
        rectangle.setWidth(100);   rectangle.setHeight(100);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.CORNSILK);
        rectangle.setFill(Color.GREENYELLOW);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                240.0,270.0,
                160.0, 270.0
        );
        triangle.setFill(Color.GAINSBORO);
        triangle.setStroke(Color.LIGHTSTEELBLUE);

        Circle circle = new Circle();
        circle.setCenterX(450);
        circle.setCenterY(450);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

//        Image image = new Image("icon.png");
//        ImageView imageView = new ImageView(image);
//        imageView.setX(300);
//        imageView.setY(450);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
//        root.getChildren().add(imageView);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}