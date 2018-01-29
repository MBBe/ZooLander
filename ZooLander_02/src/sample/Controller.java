package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    public void penClick() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Pens.fxml"));
        Stage stage = new Stage ();

        stage.setTitle("Pens");
        stage.setScene(new Scene(root, 675, 455));
        stage.show();
    }

    public void keeperClick() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Keepers.fxml"));
        Stage stage = new Stage ();

        stage.setTitle("Keepers");
        stage.setScene(new Scene(root, 675, 455));
        stage.show();
    }


}
