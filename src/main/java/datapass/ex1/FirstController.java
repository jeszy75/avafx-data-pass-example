package datapass.ex1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.tinylog.Logger;

import java.io.IOException;

public class FirstController {

    @FXML
    private TextField nameField;

    @FXML
    private void initialize() {
        nameField.setText(System.getProperty("user.name"));
    }

    @FXML
    private void handleNextButton(ActionEvent event) throws IOException {
        Logger.info("Name entered: {}", nameField.getText());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setUserData(nameField.getText()); // Storing the entered text in the current stage via setUserData()
        stage.setScene(new Scene(root));
        stage.show();
    }

}
