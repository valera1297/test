package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
<<<<<<< HEAD
<<<<<<< Updated upstream
        primaryStage.setScene(new Scene(root, 300, 275));
=======
        primaryStage.setScene(new Scene(root, 2000, 275));
>>>>>>> Stashed changes
=======
        primaryStage.setScene(new Scene(root, 200, 275));
>>>>>>> parent of 47a720d... Revert "200test"
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
