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

public class AnimalScene extends Application {

    Stage window;
    //Scene scene1, scene2;
    TableView<Animal> table;
    TextField animalInput, PenInput, SizeInput, QuantityInput;
    ObservableList<Animal> animals = FXCollections.observableArrayList();

    /*public static void main (String[] args) {
        launch(args);
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo");
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

        //Quantity column
        TableColumn<Animal, String> QuantityColumn = new TableColumn<>("Quantity");
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
        hBox.getChildren().addAll(animalInput, PenInput, SizeInput, QuantityInput, addButton, deleteButton);


        table = new TableView<>();

        table.setItems(animals);
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
        Animal pen = new Animal();
        pen.setAnimal(animalInput.getText());
        pen.setPenType(PenInput.getText());
        pen.setAnimalSize(Double.parseDouble(SizeInput.getText()));
        pen.setQuantity(Integer.parseInt(QuantityInput.getText()));
        animals.add(pen);
        animalInput.clear();
        PenInput.clear();
        SizeInput.clear();
        QuantityInput.clear();
        showTable();

    }

    //Get all of the products
    private void initializePens(){
        animals.add(new Animal("Sloths", "Dry", 3.00, 5));
        animals.add(new Animal("Penguins", "Part Water, part dry", 2.0, 20));
        animals.add(new Animal("Goats", "Dry", 3.00, 4));
        animals.add(new Animal("Dogs", "Petting", 3.5, 7));
        animals.add(new Animal("Owls", "Aviary", 20, 3));
        animals.add(new Animal("Dolphins", "Aquarium", 40, 4));
        animals.add(new Animal("Hippos", "Part Water, part dry", 10, 5));
        animals.add(new Animal("Cats", "Petting", 4.0, 6));
        animals.add(new Animal("Elephants", "Dry", 405.00, 5));
    }
}

