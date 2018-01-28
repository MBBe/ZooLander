package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Welcome to ZooLander, The World's greatest Zoo for really, really, really good looking animals!");
        primaryStage.setScene(new Scene(root, 725, 575));
        primaryStage.show();
}


    public static void main(String[] args) {
        launch(args);





        //List of Data to draw from
        ArrayList<sample.Keeper> Keepers = new ArrayList<sample.Keeper>();
        ArrayList<sample.Animal> Animals = new ArrayList<sample.Animal>();


        String ZooName = "Zoolander";
        int ZooSize = 150000;
        sample.Keeper[] ZooKeepers = new sample.Keeper[4];
        sample.Animal[] ZooAnimals = new sample.Animal[8];


        //Keeper Array
        
            Keepers.add(new sample.Keeper("Alex", "Aquarium"));//0
            Keepers.add(new sample.Keeper("Hardip", "Dry"));//1
            Keepers.add(new sample.Keeper("Alan", "Petting"));//2
            Keepers.add(new sample.Keeper("Farhad", "Aviary"));//3


        System.out.println("Keepers: " + Keepers);


        //Animal Array
        //sample.Keeper[] OwlKeeper = (sample.Keeper.get(3));
        Animals.add(new sample.Animal("Owl", 20, 0));//0
        Animals.add(new sample.Animal("Cat", 4, 0));//1
        Animals.add(new sample.Animal("Dog", 3.5, 0));//2
        Animals.add(new sample.Animal("Sloth", 3, 0));//3
        Animals.add(new sample.Animal("Dolphin", 40, 0));//4
        Animals.add(new sample.Animal("Hippos", 10, 20));//5
        Animals.add(new sample.Animal("Goats", 3, 0));//6
        Animals.add(new sample.Animal("Penguins", 2, 4));//7

        System.out.println("Animals: " + Animals);




    }
}
