import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import models.Move;

import java.util.Observable;


public class aplikacja  extends Application {



    Stage window;
    TableView<Move>tabela;


    public TableView<Move> getTabela() {
        return tabela;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("filmy");

    tabela = new TableView<>();

        TableColumn<Move,String> tytulFilmu = new TableColumn<>("tytul");
        tytulFilmu.setCellValueFactory(new PropertyValueFactory<>("tytul"));
        tabela.getColumns().addAll(tytulFilmu);

        TableColumn<Move,Integer> rokProdukcji = new TableColumn<>("year");
        rokProdukcji.setCellValueFactory(new PropertyValueFactory<>("year"));
        tabela.getColumns().addAll(rokProdukcji);

        TableColumn<Move,String> kategoriaFilmy = new TableColumn<>("kategoria");
        kategoriaFilmy.setCellValueFactory(new PropertyValueFactory<>("kategoria"));
        tabela.getColumns().addAll(kategoriaFilmy);

        TableColumn<Move,Integer> dlugoscFilmu = new TableColumn<>("length");
        dlugoscFilmu.setCellValueFactory(new PropertyValueFactory<>("length"));
        tabela.getColumns().addAll(dlugoscFilmu);


        tabela.setItems(getMovies());



        VBox szablon = new VBox(10);
        szablon.getChildren().addAll(tabela);
        Scene scena = new Scene(szablon,800,600);
                window.setScene(scena);
        window.show();
    }


   public ObservableList<Move> getMovies() {

        ObservableList<Move> filmy = FXCollections.observableArrayList(

                new Move("obcy","fantastyka",1989,123),
                new Move("obcy2","fantastyka",1989,142),
                new Move("obcy3","fantastyka",1989,89),
                new Move("obcy przebudzenie","fantastyka",1989,153),
                new Move("obcy przymierze","fantastyka",2017,110)
        ) ;


       return filmy;
    }


    


}
