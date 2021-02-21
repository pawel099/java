package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import java.util.ArrayList;
import javafx.stage.Stage;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main extends Application {

    private int counter = 0;
    ArrayList<Button>  przyciskList = new ArrayList<>();
    int lastIndex;

    @Override

    public void start(Stage primaryStage) throws Exception {

        FlowPane flow = new FlowPane();

        flow.setVgap(30);
        flow.setHgap(40);

        for (int index=0; index<5;index++) {

            if (index > 0) {


                Button przycisk = new Button();
                przycisk.setPrefWidth(120);
                przycisk.setPrefHeight(120);
                przycisk.setId(String.valueOf(index));
                przyciskList.add(przycisk);

                przycisk.setOnAction(event -> {

                     counter++;

                    Button clickmybutton = (Button) event.getSource();
                    Image zmienna = new Image(getClass().getResourceAsStream("image/"+clickmybutton.getId()+".png"));
                    ImageView ax = new ImageView(zmienna);

                    ax.setImage(zmienna);
                    ax.setPreserveRatio(true);
                    ax.setFitWidth(400);
                    ax.setFitHeight(300);
                    przycisk.setGraphic(new ImageView(zmienna));



                    if (counter % 2==0) {

                        if (przyciskList.get(lastIndex).getId().equals(clickmybutton.getId())) {
                            clickmybutton.setDisable(true);
                            counter++;
                        }
                    }

                    else {

                        przyciskList.get(lastIndex).setGraphic(null);
                        counter=0;
                    }

                    lastIndex= przyciskList.lastIndexOf(clickmybutton);
                    System.out.println(lastIndex);

                    });

                    flow.getChildren().add(przycisk);

              }
           }

                 primaryStage.setTitle("aplication");
                 primaryStage.setScene(new Scene(flow,550,360));
                 primaryStage.show();
             }

                public static void main(String[] args) {
                launch(args);
    }

}
