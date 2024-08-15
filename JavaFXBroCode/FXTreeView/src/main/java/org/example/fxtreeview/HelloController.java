package org.example.fxtreeview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TreeView<String> myTreeView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("folder.jpg")));
        imageView.setFitHeight(20);    imageView.setFitWidth(20);
        TreeItem<String> rootItem = new TreeItem<>("Folders", imageView);

        ImageView imageView1 = new ImageView(new Image(getClass().getResourceAsStream("picture.jpg")));
        imageView1.setFitHeight(20);    imageView1.setFitWidth(20);
        ImageView imageView2 = new ImageView(new Image(getClass().getResourceAsStream("video.png")));
        imageView2.setFitHeight(20);    imageView2.setFitWidth(20);
        ImageView imageView3 = new ImageView(new Image(getClass().getResourceAsStream("document.jpg")));
        imageView3.setFitHeight(20);    imageView3.setFitWidth(20);
        TreeItem<String> branchItem1 = new TreeItem<>("Pictures", imageView1);
        TreeItem<String> branchItem2 = new TreeItem<>("Videos", imageView2);
        TreeItem<String> branchItem3 = new TreeItem<>("Documents", imageView3);

        TreeItem<String> leafItem1 = new TreeItem<>("Picture 1");
        TreeItem<String> leafItem2 = new TreeItem<>("Picture 2");
        TreeItem<String> leafItem3 = new TreeItem<>("Video 1");
        TreeItem<String> leafItem4 = new TreeItem<>("Video 2");
        TreeItem<String> leafItem5 = new TreeItem<>("Document 1");
        TreeItem<String> leafItem6 = new TreeItem<>("Document 2");

        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);
        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
        myTreeView.setRoot(rootItem);
    }

    public void selectItem(){
        TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
        if (item != null){
            System.out.println(item.getValue());
        }
    }
}