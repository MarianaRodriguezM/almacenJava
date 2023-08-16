package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class ProductosNaturalJ {

    @FXML
    private TableView<?> tabla1;

    @FXML
    private Button x;

    @FXML
    void aceptar (ActionEvent event){
        System.exit(0);
    }
}
