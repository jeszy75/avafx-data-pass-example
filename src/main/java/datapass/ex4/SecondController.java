package datapass.ex4;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import org.tinylog.Logger;

public class SecondController {

    @FXML
    private Text text;

    private final StringProperty name = new SimpleStringProperty();

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
        Logger.info("name is set to {}", name);
    }

    @FXML
    private void initialize() {
        Logger.info("name: {}", name);
        text.textProperty().bind(Bindings.concat("Hello, ", name, "!"));
    }

    @FXML
    private void handleExitButton(ActionEvent event) {
        Platform.exit();
    }

}
