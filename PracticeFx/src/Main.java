import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    TableView <Pens> table;

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

        table = new TableView<>();
        table.setItems(getPens());
        table.getColumns().addAll (AnimalColumn, PenTypeColumn, PenSizeColumn, QuantityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(Pens);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();

    }
    //Get all of the products
    public ObservableList<Pens>getPens(){
        ObservableList<Pens> pens = FXCollections.observableArrayList();
        pens.add(new Pens("Sloths", "Dry", 9.0, 5));
        pens.add(new Pens("Penguins", "Part Water, part dry", 80.0, 20));
        pens.add(new Pens("Goats", "Dry", 36.0, 4));
        pens.add(new Pens("Dogs", "Petting", 85.75, 7));
        pens.add(new Pens("Owls", "Aviary", 180.0, 3));
        pens.add(new Pens("Dolphins", "Aquarium", 480.0, 4));
        pens.add(new Pens("Hippos", "Part Water, part dry", 500, 5));
        pens.add(new Pens("Cats", "Petting", 96.0, 6));
        pens.add(new Pens("Elephants", "Dry", 405.0, 5));
        return pens;
    }
}










