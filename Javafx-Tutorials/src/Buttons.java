/**
 * Created by Manasseh on 21/12/2017.
 */
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;




public class Buttons extends Application  {


    Button button;


    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //primaryStage.setTitle("ZooLander");
        button = new Button();
        button.setText ("Hey baby");


        //The class will handle the button events
        //button.setOnAction(e -> System.out.println("hey now brown cow"));
        button.setOnAction(e -> {
            System.out.println("hey now brown cow");
            System.out.println("I am a meatball");
        });



        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
