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

public class Main extends Application {

    Stage window;
    //Scene scene1, scene2;
    TableView<Pens> table;
    TextField animalInput, PenInput, SizeInput, QuantityInput;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo");

        //Animal column
        TableColumn<Pens, String> AnimalColumn = new TableColumn<>("Animal");
        AnimalColumn.setMinWidth(200);
        AnimalColumn.setCellValueFactory(new PropertyValueFactory<>("Animal"));

        //PenType column
        TableColumn<Pens, String> PenTypeColumn = new TableColumn<>("Pen Type");
        PenTypeColumn.setMinWidth(200);
        PenTypeColumn.setCellValueFactory(new PropertyValueFactory<>("PenType"));

        //PenSize column
        TableColumn<Pens, Double> PenSizeColumn = new TableColumn<>("Pen Size");
        PenSizeColumn.setMinWidth(100);
        PenSizeColumn.setCellValueFactory(new PropertyValueFactory<>("PenSize"));

        //Quantity column
        TableColumn<Pens, String> QuantityColumn = new TableColumn<>("Quantity");
        QuantityColumn.setMinWidth(100);
        QuantityColumn.setCellValueFactory(new PropertyValueFactory<>("Quantity"));

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

        QuantityInput = new TextField();
        QuantityInput.setPromptText ("add Quantity");

        //Button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e ->deleteButtonClicked());

        //Choice Box
        ChoiceBox<String> choiceBox =new ChoiceBox<>();
        //get Items returns the ObservableList
        choiceBox.getItems().addAll("Animal", "Pen", "Size", "Quantity");
        //set default Value
        choiceBox.setValue("Animal");

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(40,40,40,40));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(animalInput, PenInput, SizeInput, QuantityInput, addButton, deleteButton, choiceBox);


        table = new TableView<>();
        table.setItems(getPens());
        table.getColumns().addAll(AnimalColumn, PenTypeColumn, PenSizeColumn, QuantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }

    //get the value of the item from the choice Box
    /*private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.print(food);
    }*/

    //Add button clicked
    public void addButtonClicked(){
        Pens pen = new Pens();
        Pens.setAnimal(animalInput.getText);
        

    }

    //Get all of the products
    public ObservableList<Pens> getPens(){
        ObservableList<Pens> pens = FXCollections.observableArrayList();
        pens.add(new Pens("Sloths", "Dry", 9.00, 5));
        pens.add(new Pens("Penguins", "Part Water, part dry", 80.0, 20));
        pens.add(new Pens("Goats", "Dry", 36.00, 4));
        pens.add(new Pens("Dogs", "Petting", 85.75, 7));
        pens.add(new Pens("Owls", "Aviary", 180.00, 3));
        pens.add(new Pens("Dolphins", "Aquarium", 480.00, 4));
        pens.add(new Pens("Hippos", "Part Water, part dry", 500.0, 5));
        pens.add(new Pens("Cats", "Petting", 96.00, 6));
        pens.add(new Pens("Elephants", "Dry", 405.00, 5));
        return pens;
    }
}

