package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @web http://java-buddy.blogspot.com/
 */
public class Main extends Application {

    public class Record {
        //Assume each record have 6 elements, all String

        private SimpleStringProperty Animal, PenType, Requirements_per_animal;

        public String getAnimal() {
            return Animal.get();
        }

        public String getPenType() {
            return PenType.get();
        }

        public String getRequirements_per_animal() {
            return Requirements_per_animal.get();
        }


        Record(String Animal, String PenType, String Requirements_per_animal) {
            this.Animal = new SimpleStringProperty(Animal);
            this.PenType = new SimpleStringProperty(PenType);
            this.Requirements_per_animal = new SimpleStringProperty(Requirements_per_animal);
        }

    }

    private final TableView<Record> tableView = new TableView<>();

    private final ObservableList<Record> dataList
            = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ZooLander- The world's no.1 Zoo for really, really, really good looking animals");

        Group root = new Group();

        TableColumn columnAnimal = new TableColumn("Animal");
        columnAnimal.setCellValueFactory(
                new PropertyValueFactory<>("Animal"));

        TableColumn columnPenType = new TableColumn("Pen Type");
        columnPenType.setCellValueFactory(
                new PropertyValueFactory<>("Pen Type"));

        TableColumn columnRequirements_per_animal = new TableColumn("Requirements per animal");
        columnRequirements_per_animal.setCellValueFactory(
                new PropertyValueFactory<>("Requirements per animal"));



        tableView.setItems(dataList);
        tableView.getColumns().addAll(
                columnAnimal, columnPenType, columnRequirements_per_animal);

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.getChildren().add(tableView);

        root.getChildren().add(vBox);

        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();

        readCSV();
    }

    private void readCSV() {
        //C:\Users\a-mboyd\Documents\Intellij Projects\Zoo_CVS\Animal_info_doc.txt
        //C:\Users\a-mboyd\Documents\Intellij Projects\Zoo_CVS\Animal_info_doc.csv

        String CsvFile = "C:\\Users\\a-mboyd\\Documents\\Intellij Projects\\Zoo_CVS\\Animal_info_doc.csv";
        String FieldDelimiter = ",";

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(CsvFile));

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter, -1);

                Record record = new Record(fields[0], fields[1], fields[2]);
                dataList.add(record);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}

