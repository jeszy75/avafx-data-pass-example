package datapass.ex2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import org.tinylog.Logger;

public class SecondController {

    @FXML
    private Text text;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Logger.info("name is set to {}", name);
    }

    @FXML
    private void initialize() {
        Logger.info("name: {}", name);
        text.setText("Hello, " + name + "!");
    }

    @FXML
    private void handleExitButton(ActionEvent event) {
        Platform.exit();
    }

}
