package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class loginGUI {

    @FXML
    private Button showsing;

    @FXML
    private Button showlogin;

    @FXML
    private TextField username1;

    @FXML
    private TextField pasword1;

    @FXML
    void loguser(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vista.fxml"));
    	
    	fxmlLoader.setController(this);
		AnchorPane vista = fxmlLoader.load();
    	
		
    }
}