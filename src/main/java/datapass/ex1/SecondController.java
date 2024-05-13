package datapass.ex1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.tinylog.Logger;

public class SecondController {

    @FXML
    private Text text;

    private String name;

    @FXML
    private void initialize() {
        Platform.runLater(() -> {
            Stage stage = (Stage) text.getScene().getWindow();
            name = (String) stage.getUserData(); // Retrieving the stored text from the current stage via getUserData()
            Logger.info("Name retrieved: {}", name);
            text.setText("Hello, " + name + "!");
        });
    }

    @FXML
    private void handleExitButton(ActionEvent event) {
        Platform.exit();
    }

}
