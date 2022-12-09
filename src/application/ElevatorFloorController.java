package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ElevatorFloorController {

    @FXML
    private Button createElevatorButton;

    @FXML
    private ChoiceBox<?> floorsChoiceBox;

    @FXML
    void createElevator(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load(new FileInputStream("src/application/ElevatorPanelView.fxml"));
			Stage secondaryStage = (Stage) createElevatorButton.getScene().getWindow();
			Scene scene = new Scene(root,400,400);
			secondaryStage.setScene(scene);
			secondaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
