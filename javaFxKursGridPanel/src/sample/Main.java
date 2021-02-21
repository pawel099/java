package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application   {

    @FXML
    private Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("aplication");
        primaryStage.setScene(new Scene(root, 600, 475));
        primaryStage.show();
    }


    @FXML
        void initialize() {
        button.setText("kkskksksk");
    }


    @FXML
    public void przycisk() {
        System.out.println("hello worlds");
    }


    public static void main(String[] args) {
        launch(args);


    }
}
