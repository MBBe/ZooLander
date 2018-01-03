//package main;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.Scene;
import javafx.scene.control.TabPane.TabClosingPolicy;

/**
 * Created by Manasseh on 26/12/2017.
 */
public class Main extends Application {

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start (Stage stage) throws Exception {

        TabPane tp = new TabPane();
        tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        Tab animals_tab = new Tab("Animals");

        Tab pen_tab = new Tab("Pens");

        Tab keeper_tab = new Tab ("Keepers");

        tp.getTabs().addAll(animals_tab, pen_tab, keeper_tab);

        Scene scene = new Scene (tp);

        stage.setTitle("ZooLander Zoo");
        stage.setX(400);
        stage.setY(100);
        stage.setHeight(500);
        stage.setWidth(600);
        stage.setScene(scene);
        stage.show();
    }
}
