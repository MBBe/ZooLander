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
        Button AutoFill = new Button ("Auto Fill");


        //Choice Box
        ChoiceBox<String> choiceBox =new ChoiceBox<>();
        //get Items returns the ObservableList
        choiceBox.getItems().addAll("Sloths", "Goats", "Cats", "Dogs", "Owls", "Dolphins", "Penguins", "Hippos",
                                    "Hardip", "Alex", "Alan", "Farhad", "Agent J", "Marty McFly", "Indiana Jones");
        //set default Value
        choiceBox.setValue("Sloths");
        AutoFill.setOnAction(e -> AutoFillClicked(choiceBox));




        HBox hBox = new HBox();
        hBox.setPadding(new Insets(20, 20, 20, 20));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, sizeInput, animalsInput, keeperInput, addButton, deleteButton, choiceBox, AutoFill);


        table = new TableView<>();
        Label label1 = new Label("");
        label1.setPadding(new Insets(15,15,15,15));


        table.setItems(pens);
        table.getColumns().addAll(NameColumn, SizeColumn, AnimalColumn, KeeperColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox, label1);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

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

    //AutoFill button clicked
    private void AutoFillClicked (ChoiceBox <String> choiceBox){
        String Zoo = choiceBox.getValue();
        System.out.print(Zoo);
    }




    //Get all of the products
    private void initializePen(){

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] s=line.split(",");

                double penSize = Double.parseDouble(s[2]);
                pens.add(new Pen(s[0],s[1],s[3],penSize));
            }
        }catch(Exception e){

        }


    }
    private void addToFile (String name, String animal, String size, String keeper){
        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(name + "," + animal + "," + size + "," + keeper);
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