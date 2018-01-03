import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;
//import sample.AlertBoxes;

//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;




public class Main extends Application  {


    Button button;
    Window window;


    public static void main(String[] args){

        launch (args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle ("Zoolander");

        button = new Button("Click Me");
        button.setOnAction(e -> AlertBoxes.display("Title of the Window"));



        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

}
