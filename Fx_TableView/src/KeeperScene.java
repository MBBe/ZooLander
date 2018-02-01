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

public class KeeperScene extends Application {

    Stage window;
    TableView<Keeper> table;
    TextField KeeperNameInput, KeeperPensInput;
    ObservableList<Keeper> keepers = FXCollections.observableArrayList();

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ZooLander Zoo - Keepers");
        initializePen();
        showTable();
    }

    private void showTable (){

        //Name column
        TableColumn<Keeper, String> NameColumn = new TableColumn<>("Keeper Name");
        NameColumn.setMinWidth(200);
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("KeeperName"));

        //Size column
        TableColumn<Keeper, String> penColumn = new TableColumn<>("Keeper Pen");
        penColumn.setMinWidth(200);
        penColumn.setCellValueFactory(new PropertyValueFactory<>("KeeperPens"));

         //Name input
        //nameInput, sizeInput, animalInput
        KeeperNameInput = new TextField();
        KeeperNameInput.setPromptText("add keeper name");
        KeeperNameInput.setMinWidth(100);

        //size input
        KeeperPensInput = new TextField();
        KeeperPensInput.setPromptText("add pen name");

        //animalsInput = new TextField();
        //animalsInput.setPromptText("add Animal");


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
        hBox.getChildren().addAll(KeeperNameInput, KeeperPensInput, addButton, deleteButton);


        table = new TableView<>();

        table.setItems(keepers);
        table.getColumns().addAll(NameColumn, penColumn);

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
        Keeper keeper = new Keeper();
        keeper.setKeeperName(KeeperNameInput.getText());
        keeper.setKeeperPens(KeeperPensInput.getText());

        keepers.add(keeper);
        KeeperNameInput.clear();
        KeeperPensInput.clear();
        showTable();

    }

    //Get all of the products
    private void initializePen(){
        keepers.add(new Keeper("Hardip", "Dry"));
        keepers.add(new Keeper("Alex", "Aquarium, part water, part dry pen"));
        keepers.add(new Keeper("Farhad", "Aviary"));
        keepers.add(new Keeper("Allan", "Petting Pen"));

    }
}