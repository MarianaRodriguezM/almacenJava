package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       FXMLLoader login= new FXMLLoader(getClass().getResource("Almacen.fxml"));
       Parent root= login.load();
       Scene loginScene= new Scene(root);
       stage.setScene(loginScene);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}