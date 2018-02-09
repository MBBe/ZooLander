import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.*;

public class ZooScene extends Application  {

    Stage window;
    TableView<Zoo> table;
    TextField PenNameInput, PenTypeInput, Animal1Input, Animal2Input, Animal3Input, Animal4Input, KeeperInput;
    ObservableList<Zoo> ZooLand = FXCollections.observableArrayList();
    ObservableList<Zoo> ZooPenSelected, allZooPens, updatedZooPens;
    //ObservableList<Pen> penSelected, allPens;
    String file = "C:\\Users\\a-mboyd\\Documents\\Intellij Projects\\Fx_TableView\\src\\zoo.txt";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo - ZooLander");
        initializeZoo();
        showTable();
    }

    private void showTable() {

        //Pen Name column
        TableColumn<Zoo, String> PenNameColumn = new TableColumn<>("Pen Name");
        PenNameColumn.setMinWidth(200);
        PenNameColumn.setCellValueFactory(new PropertyValueFactory<>("PenName"));

        //Pen Type column
        TableColumn<Zoo, String> PenTypeColumn = new TableColumn<>("Pen Type");
        PenTypeColumn.setMinWidth(200);
        PenTypeColumn.setCellValueFactory(new PropertyValueFactory<>("PenType"));

        //Animal 1 column
        TableColumn<Zoo, String> Animal1Column = new TableColumn<>("Animal no.1");
        Animal1Column.setMinWidth(100);
        Animal1Column.setCellValueFactory(new PropertyValueFactory<>("Animal1"));

        //Animal 2 column
        TableColumn<Zoo, String> Animal2Column = new TableColumn<>("Animal no.2");
        Animal2Column.setMinWidth(200);
        Animal2Column.setCellValueFactory(new PropertyValueFactory<>("Animal2"));

        //Animal 3 column
        TableColumn<Zoo, String> Animal3Column = new TableColumn<>("Animal no.3");
        Animal3Column.setMinWidth(200);
        Animal3Column.setCellValueFactory(new PropertyValueFactory<>("Animal3"));

        //Animal 4 column
        TableColumn<Zoo, String> Animal4Column = new TableColumn<>("Animal no.4");
        Animal4Column.setMinWidth(200);
        Animal4Column.setCellValueFactory(new PropertyValueFactory<>("Animal4"));

        //Keeper column
        TableColumn<Zoo, String> KeeperColumn = new TableColumn<>("Assigned Keeper");
        KeeperColumn.setMinWidth(200);
        KeeperColumn.setCellValueFactory(new PropertyValueFactory<>("Keeper"));


        //PenNameInput
        //PenNameInput, PenTypeInput, Animal1Input, Animal2Input, Animal3Input, Animal4Input, KeeperInput
        PenNameInput = new TextField();
        PenNameInput.setPromptText("add Pen Name");
        PenNameInput.setMinWidth(100);

        //PenTypeInput
        PenTypeInput = new TextField();
        PenTypeInput.setPromptText("add Pen Type");

        //Animal1Input
        Animal1Input = new TextField();
        Animal1Input.setPromptText("add Animal no.1");

        //Animal2Input
        Animal2Input = new TextField();
        Animal2Input.setPromptText("add Animal no.2");

        //Animal3Input
        Animal3Input = new TextField();
        Animal3Input.setPromptText("add Animal no.3");

        //Animal4Input
        Animal4Input = new TextField();
        Animal4Input.setPromptText("add Animal no.4");

        //KeeperInput
        KeeperInput = new TextField();
        KeeperInput.setPromptText("add Keeper");






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
        hBox.getChildren().addAll(PenNameInput, PenTypeInput, Animal1Input, Animal2Input, Animal3Input, Animal4Input, KeeperInput, addButton, deleteButton);


        table = new TableView<>();
        Label label1 = new Label("This Pen is full. The Last animal is: ");
        label1.setPadding(new Insets(10,10,10,10));

        Label label2 = new Label ("");
        label2.setTextFill(Color.CRIMSON);
        label2.setPadding(new Insets(10,10,10,10));
        label2.textProperty().bind(Animal4Input.textProperty());
        HBox LabelBox = new HBox (label1, label2);
        LabelBox.setAlignment(Pos.CENTER);


        table.setItems(ZooLand);
        table.getColumns().addAll(PenNameColumn, PenTypeColumn, Animal1Column, Animal2Column, Animal3Column, Animal4Column, KeeperColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox, LabelBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }

    //get the value of the item from the choice Box
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.print(food);
    }

    //Add button clicked PenNameInput, PenTypeInput, Animal1Input, Animal2Input, Animal3Input, Animal4Input, KeeperInput
    public void addButtonClicked() {
        Zoo zoo = new Zoo();
        zoo.setPenName(PenNameInput.getText());
        zoo.setPenType(PenTypeInput.getText());
        zoo.setAnimal1(Animal1Input.getText());
        zoo.setAnimal2(Animal2Input.getText());
        zoo.setAnimal3(Animal3Input.getText());
        zoo.setAnimal4(Animal4Input.getText());
        zoo.setKeeper(KeeperInput.getText());

        ZooLand.add(zoo);
        addToFile(PenNameInput.getText(), PenTypeInput.getText(), Animal1Input.getText(), Animal2Input.getText(),
                Animal3Input.getText(), Animal4Input.getText(), KeeperInput.getText());
        PenNameInput.clear();
        PenTypeInput.clear();
        Animal1Input.clear();
        Animal2Input.clear();
        Animal3Input.clear();
        Animal4Input.clear();
        KeeperInput.clear();
        showTable();


    }

    //Delete button clicked
    public void deleteButtonClicked() {
        //ObservableList<Pen> penSelected, allPens;
        allZooPens = table.getItems();
        ZooPenSelected = table.getSelectionModel().getSelectedItems();

        ZooPenSelected.forEach(allZooPens::remove);

    }




    //Get all of the products
    private void initializeZoo(){

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                String[] s=line.split(",");
                //Double[] d=line.split(",");
                ZooLand.add(new Zoo(s[0],s[1],s[2],s[3],s[4],s[5],s[6]));
            }
        }catch(Exception e){

        }

    }
    private void addToFile (String PenName, String PenType, String Animal1, String Animal2, String Animal3, String Animal4, String Keeper){
        BufferedWriter bw = null;

        try {
            // APPEND MODE SET HERE
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(PenName + "," + PenType + "," + Animal1 + "," + Animal2 + "," + Animal3 + "," + Animal4 + "," + Keeper);
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
