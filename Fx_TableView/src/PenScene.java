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

public class PenScene extends Application  {

    Stage window;
    TableView<Pen> table;
    TextField nameInput, sizeInput, animalsInput, keeperInput;
    ObservableList<Pen> pens = FXCollections.observableArrayList();
    ObservableList<Pen> penSelected, allPens, updatedPens;
    //ObservableList<Pen> penSelected, allPens;
    String file = "C:\\Users\\a-mboyd\\Documents\\Intellij Projects\\Fx_TableView\\src\\pen.txt";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo - Pens");
        initializePen();
        showTable();
    }

    private void showTable() {

        //Name column
        TableColumn<Pen, String> NameColumn = new TableColumn<>("Pen Type");
        NameColumn.setMinWidth(200);
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));

        //Size column
        TableColumn<Pen, Double> SizeColumn = new TableColumn<>("Pen Size");
        SizeColumn.setMinWidth(200);
        SizeColumn.setCellValueFactory(new PropertyValueFactory<>("Size"));

        //Animal column
        TableColumn<Pen, String> AnimalColumn = new TableColumn<>("Animals");
        AnimalColumn.setMinWidth(100);
        AnimalColumn.setCellValueFactory(new PropertyValueFactory<>("Animal"));

        //Keeper column
        TableColumn<Pen, String> KeeperColumn = new TableColumn<>("Assign Keeper");
        KeeperColumn.setMinWidth(200);
        KeeperColumn.setCellValueFactory(new PropertyValueFactory<>("Keeper"));


        //Name input
        //nameInput, sizeInput, animalInput
        nameInput = new TextField();
        nameInput.setPromptText("add Pen");
        nameInput.setMinWidth(100);

        //size input
        sizeInput = new TextField();
        sizeInput.setPromptText("add Pen size");

        animalsInput = new TextField();
        animalsInput.setPromptText("add Animal");

        keeperInput = new TextField();
        keeperInput.setPromptText("add Keeper");


        //Button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        //Choice Box
        //ChoiceBox<String> choiceBox =new ChoiceBox<>();
        //get Items returns the ObservableList
        //choiceBox.getItems().addAll("Animal", "Pen", "Size", "Quantity");
        //set default Value
        //choiceBox.setValue("Animal");

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(20, 20, 20, 20));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, sizeInput, animalsInput, keeperInput, addButton, deleteButton);


        table = new TableView<>();
        Label label1 = new Label("All new Pens made are 30 meters squared. Part Wet and Part Dry Pens are 10 meters squared and 20 meters cubed. Aviary is...");
        label1.setPadding(new Insets(15,15,15,15));


        table.setItems(pens);
        table.getColumns().addAll(NameColumn, SizeColumn, AnimalColumn, KeeperColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox, label1);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }

    //get the value of the item from the choice Box
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.print(food);
    }

    //Add button clicked
    public void addButtonClicked() {
        Pen pen = new Pen();
        pen.setName(nameInput.getText());
        pen.setAnimal(animalsInput.getText());
        pen.setSize(Double.parseDouble(sizeInput.getText()));
        pen.setKeeper(keeperInput.getText());

        pens.add(pen);
        addToFile(nameInput.getText(), animalsInput.getText(), sizeInput.getText(), keeperInput.getText());
        nameInput.clear();
        sizeInput.clear();
        animalsInput.clear();
        keeperInput.clear();
        showTable();


    }

    //Delete button clicked
    public void deleteButtonClicked() {
        //ObservableList<Pen> penSelected, allPens;
        allPens = table.getItems();
        penSelected = table.getSelectionModel().getSelectedItems();

        penSelected.forEach(allPens::remove);

    }




    //Get all of the products
    private void initializePen(){

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                String[] s=line.split(",");
                //Double[] d=line.split(",");
                double penSize = Double.parseDouble(s[2]);
                pens.add(new Pen(s[0],s[1],s[3],penSize));
            }
        }catch(Exception e){

        }




        /*pens.add(new Pen("Dry", "Sloths", 100));
        pens.add(new Pen("Dry", "Goats", 100));
        pens.add(new Pen("Dry", "Cats",100));
        pens.add(new Pen("Petting", "Dogs",100));
        pens.add(new Pen("Aviary", "Owls", 100));
        pens.add(new Pen("Aquarium", "Dolphins", 100));
        pens.add(new Pen("Part wet, Part dry", "Penguins", 100));
        pens.add(new Pen("Part wet, Part dry", "Hippos", 100));*/
    }
    private void addToFile (String name, String animal, String size, String keeper){
        BufferedWriter bw = null;

        try {
            // APPEND MODE SET HERE
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(name + "," + animal + "," + size + "," + keeper);
            bw.newLine();
            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {                       // always close the file
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {
                // just ignore it
            }
        } // end try/catch/finally



    }





}