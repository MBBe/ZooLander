package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

   /* @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

    //List of Data to draw from
   ArrayList<Pen> Pens = new ArrayList<Pen>();
   ArrayList<Animal> Animals = new ArrayList<Animal>();

    //Variables about the Zoo
    String ZooName = "ZooLander";
    double ZooSize = 5000;
    Pen[] ZooPens = new Pen[8];
    Animal[] ZooAnimals = new Animal[8];

    //Method to create Data
    public void createData(){
        inputPens();
        inputAnimals();
    }

    private void inputPens(){
        Pens.add(new Pens("Dry", 833, "Goat", "Hardip"));
        Pens.add(new Pens("Petting", 833, "Dog", "Alan"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
