package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Classes.*;

import java.util.ArrayList;

public class Main extends Application {

    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }


    public static void main(String[] args) {launch(args);

        //List of Data to draw from
        ArrayList<Keeper> Keepers = new ArrayList<Keeper>();
        ArrayList<Animal> Animals = new ArrayList<Animal>();

        //method to create data
        public void createData() {
            inputKeepers();
            inputAnimals();
        }

        String ZooName = "Zoolander";
        int ZooSize = 150000;
        Keeper [] ZooKeepers = new Keeper[4];
        Animal [] ZooAnimals = new Animal[8];

        //create data
        public void createData () {
            inputKeepers();
            inputAnimals();
        }


        //method to create all Keepers
        private void inputKeepers() {
        Keepers.add(new Keeper("Alex", "Aquarium"));
        Keepers.add(new Keeper("Hardip", "Dry"));
        Keepers.add(new Keeper("Alan", "Petting"));
        Keepers.add(new Keeper("Farhad", "Aviary"));
        }

        //method to create all animals
        private void inputAnimals() {
            Keeper[] OwlKeeper = (Keeper.get(3));
            Animals.add(new Animal("Owl", 20, 0));
            Animals.add(new Animal("Cat", 4, 0));
            Animals.add(new Animal("Dog", 3.5, 0));
            Animals.add(new Animal("Sloth", 3, 0));
            Animals.add(new Animal("Dolphin", 40, 0));
            Animals.add(new Animal("Hippos", 10, 20));
            Animals.add(new Animal("Goats", 3, 0));
            Animals.add(new Animal("Penguins", 2, 4));
        }


        /*Pen Dry = new Pen();
        Dry.PenSize();
        Dry.addAnimal();

        Aviary OwlPen = new Aviary();
        OwlPen.PenSize();

        PW_PD Hippos = new PW_PD();
        Hippos.PenSize();*/

    }
}
