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
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class ElevatorPanelController {
    
	@FXML
	private Label currentFloorLabel;	
	
	@FXML
    private Button buttonOne;
		
    @FXML 
    private Button buttonTwo; 
    	
    @FXML
    private Button buttonThree;
    	
    @FXML
    private Button buttonFour;
    
    @FXML
    private Button buttonFive;
    
    int currentFloor = 0;
    int targetFloor = 0;
    
    
    // Button events
    @FXML
    void selectFloorOne(ActionEvent event) {
    	targetFloor = 1;
	}
    
    @FXML
    void selectFloorTwo(ActionEvent event) {
    	targetFloor = 2;
	}
    
    @FXML
    void selectFloorThree(ActionEvent event) {
    	targetFloor = 3;
	}
    
    @FXML
    void selectFloorFour(ActionEvent event) {
    	targetFloor = 4;
	}
    
    @FXML
    void selectFloorFive(ActionEvent event) {
    	targetFloor = 5;
	}
    
    @FXML
    void goUp(ActionEvent event) {
    	if (currentFloor == 5) {
    		currentFloorLabel.setText("Cannot go up, already at top floor.");
    }
    	else {
    		currentFloor = targetFloor;
    	}
}
    
    @FXML
    void goDown(ActionEvent event) {
    	if (currentFloor == 1) {
    		currentFloorLabel.setText("Cannot go down, already at bottom floor.");
    	}
    	else {
    		currentFloor = targetFloor;
    	}
    }

}