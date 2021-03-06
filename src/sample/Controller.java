package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea input;
    @FXML
    private TextArea output;

    @FXML
    private void translate(ActionEvent event) {
        output.setText(PigLatin.translate(input.getText()));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
