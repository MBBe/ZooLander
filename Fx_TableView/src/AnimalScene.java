import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class AnimalScene extends Application {

    Stage window;

    TableView<Animal> table;
    TextField animalInput, PenInput, SizeInput, PenIDInput;
    String file="C:\\Users\\a-mboyd\\Documents\\Intellij Projects\\Fx_TableView\\src\\animal.txt";
    ObservableList<Animal> animals = FXCollections.observableArrayList();
    ObservableList<Animal> animalSelected, allAnimals;



    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo - Animals");
        initializePens();
        showTable();
    }

    private void showTable (){

        //Animal column
        TableColumn<Animal, String> AnimalColumn = new TableColumn<>("Animal");
        AnimalColumn.setMinWidth(200);
        AnimalColumn.setCellValueFactory(new PropertyValueFactory<>("Animal"));

        //PenType column
        TableColumn<Animal, String> PenTypeColumn = new TableColumn<>("Pen Type");
        PenTypeColumn.setMinWidth(200);
        PenTypeColumn.setCellValueFactory(new PropertyValueFactory<>("PenType"));

        //PenSize column
        TableColumn<Animal, Double> PenSizeColumn = new TableColumn<>("Animal Size");
        PenSizeColumn.setMinWidth(100);
        PenSizeColumn.setCellValueFactory(new PropertyValueFactory<>("AnimalSize"));

        //PenID column
        TableColumn<Animal, String> PenIDColumn = new TableColumn<>("Quantity");
        PenIDColumn.setMinWidth(100);
        PenIDColumn.setCellValueFactory(new PropertyValueFactory<>("PenID"));

        //Name input
        //animalInput, PenInput, SizeInput, QuantityInput
        animalInput = new TextField();
        animalInput.setPromptText("add animal");
        animalInput.setMinWidth(100);

        //pen input
        PenInput = new TextField();
        PenInput.setPromptText("add Pen");

        SizeInput = new TextField();
        SizeInput.setPromptText("add Size");

        PenIDInput = new TextField();
        PenIDInput.setPromptText ("add PenID");

        //Button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e ->deleteButtonClicked());


        HBox hBox = new HBox();
        hBox.setPadding(new Insets(20,20,20,20));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(animalInput, PenInput, SizeInput, PenIDInput, addButton, deleteButton);


        table = new TableView<>();

        table.setItems(animals);
        table.getColumns().addAll(AnimalColumn, PenTypeColumn, PenSizeColumn, PenIDColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }



    //Add button clicked
    public void addButtonClicked(){
        Animal animal = new Animal();
        animal.setAnimal(animalInput.getText());
        animal.setPenType(PenInput.getText());
        animal.setAnimalSize(Double.parseDouble(SizeInput.getText()));
        animal.setPenID(Integer.parseInt(PenIDInput.getText()));

        animals.add(animal);
        addToFile(animalInput.getText(), PenInput.getText(), SizeInput.getText(), PenIDInput.getText());
        animalInput.clear();
        PenInput.clear();
        SizeInput.clear();
        PenIDInput.clear();
        showTable();

    }

    //Delete button clicked
    public void deleteButtonClicked(){
        //ObservableList<Pen> animalSelected, allAnimals;
        allAnimals = table.getItems();
        animalSelected = table.getSelectionModel().getSelectedItems();

        animalSelected.forEach(allAnimals::remove);
        //deleteFromFile();
    }

    //Get all of the products
    private void initializePens(){

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                String[] s=line.split(",");
                double animalSize = Double.parseDouble(s[2]);
                int PenID = Integer.parseInt(s[3]);
                animals.add(new Animal(s[0],s[1],animalSize,PenID));
            }
        }catch(Exception e){

        }


    }

    private void addToFile (String animal, String penType, String animalSize, String PenID){
        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(animal + "," + penType + "," + animalSize + "," + PenID);
            bw.newLine();
            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {

            }
        }

    }




}

