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

public class PenScene extends Application {

    Stage window;
    TableView<Pen> table;
    TextField nameInput, sizeInput, animalsInput;
    ObservableList<Pen> pens = FXCollections.observableArrayList();

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo - Pens");
        initializePen();
        showTable();
    }

    private void showTable (){

        //Name column
        TableColumn<Pen, String> NameColumn = new TableColumn<>("Name");
        NameColumn.setMinWidth(200);
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));

        //Size column
        TableColumn<Pen, Double> SizeColumn = new TableColumn<>("Pen Size");
        SizeColumn.setMinWidth(200);
        SizeColumn.setCellValueFactory(new PropertyValueFactory<>("Size"));

        //Animal column
        TableColumn<Pen, String> AnimalColumn = new TableColumn<>("Animal Size");
        AnimalColumn.setMinWidth(100);
        AnimalColumn.setCellValueFactory(new PropertyValueFactory<>("Animal"));


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


        //Button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        //deleteButton.setOnAction(e ->deleteButtonClicked());

        //Choice Box
        //ChoiceBox<String> choiceBox =new ChoiceBox<>();
        //get Items returns the ObservableList
        //choiceBox.getItems().addAll("Animal", "Pen", "Size", "Quantity");
        //set default Value
        //choiceBox.setValue("Animal");

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(20,20,20,20));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, sizeInput, animalsInput);


        table = new TableView<>();

        table.setItems(pens);
        table.getColumns().addAll(NameColumn, SizeColumn, AnimalColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }

    //get the value of the item from the choice Box
     private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.print(food);
    }

    //Add button clicked
    public void addButtonClicked(){
        Pen pen = new Pen();
        pen.setName(nameInput.getText());
        pen.setAnimal(animalsInput.getText());
        pen.setSize(Double.parseDouble(sizeInput.getText()));

        pens.add(pen);
        nameInput.clear();
        sizeInput.clear();
        animalsInput.clear();
        showTable();

    }

    //Get all of the products
    private void initializePen(){
        pens.add(new Pen("Dry", "Sloths", 100));
        pens.add(new Pen("Dry", "Goats", 100));
        pens.add(new Pen("Dry", "Cats",100));
        pens.add(new Pen("Petting", "Dogs",100));
        pens.add(new Pen("Aviary", "Owls", 100));
        pens.add(new Pen("Aquarium", "Dolphins", 100));
        pens.add(new Pen("Part wet, Part dry", "Penguins", 100));
        pens.add(new Pen("Part wet, Part dry", "Hippos", 100));
    }
}