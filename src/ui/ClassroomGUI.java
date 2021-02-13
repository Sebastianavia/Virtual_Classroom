package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import model.Browser;
import model.Career;
import model.Classroom;
import model.User;

public class ClassroomGUI {
	private ObservableList<?> career;
	private ObservableList<Career> browser;
	
	
	 @FXML
	 private TableView<User> tabla;

	 @FXML
	    private TableColumn<User, String> columuser;

	    @FXML
	    private TableColumn<User, String> columgender;

	    @FXML
	    private TableColumn<User, String> columcareer;

	    @FXML
	    private TableColumn<User, String> columbirthday;

	    @FXML
	    private TableColumn<User, String> columbrowser;
	
	@FXML
    private BorderPane principal;
    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private ToggleGroup genero;

    @FXML
    private ComboBox<?> cboCareer;

    @FXML
    private ComboBox<?> cbobrowser;

    @FXML
    private DatePicker dpborn;

    @FXML
    private TextField txtProfile;

    @FXML
    private ImageView img;

	
	@FXML private TextField txtUsername1;
	@FXML private TextField txtPasword1;
	
	@FXML
    private Button btnsing;
	
	@FXML
	private Button btnlogin;

    @FXML
    private Button showsing;

    @FXML
    private Button showlogin;

    @FXML
    private TextField username1;

    @FXML
    private TextField pasword1;
    
   

    private Classroom classroom;
    
    public ClassroomGUI(Classroom pClassroom) {
		classroom = pClassroom;
	}

	@FXML
    void loguser(ActionEvent event) throws IOException{
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        fxmlLoader.setController(this);
        Parent login = fxmlLoader.load();
        principal.getChildren().clear();
        principal.setCenter(login);
	}
	
	@FXML
    public void cambiarvista(ActionEvent event) throws IOException{
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vista.fxml"));
        fxmlLoader.setController(this);
        Parent vista = fxmlLoader.load();
        principal.getChildren().clear();
        principal.setCenter(vista);
        
	}
	
	@FXML
   public  void cambiarlista(ActionEvent event) throws IOException{
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("list.fxml"));
        fxmlLoader.setController(this);
        Parent list = fxmlLoader.load();
        principal.getChildren().clear();
        principal.setCenter(list);
        initializeTableView();
	}
	
	@FXML
   public  void createaccount(ActionEvent event) throws IOException {
		
		String usuario = txtUsername.getText();	
		String contraseña =  txtPassword.getText();	
		String perfil = txtProfile.getText();		
		String ge = ((RadioButton)genero.getSelectedToggle()).getText();		
		String carrera = (String) cboCareer.getSelectionModel().getSelectedItem();
		String fecha = dpborn.getValue().toString();
		String navegador = (String) cbobrowser.getSelectionModel().getSelectedItem();
		
		Image image = new Image("/img/1.png");
		
		classroom.addUser( usuario,  contraseña, perfil, ge, carrera, fecha, navegador, image);
		cambiarlista(event);
    }
	
	@FXML
    private void initializeTableView() {
        ObservableList<User> observableList;
        observableList = FXCollections.observableArrayList(classroom.getUsers());
        tabla.setItems(observableList);

        columuser.setCellValueFactory(new PropertyValueFactory<User, String>("username"));
        columgender.setCellValueFactory(new PropertyValueFactory<User, String>("gender"));
        columcareer.setCellValueFactory(new PropertyValueFactory<User, String>("career"));
        columbirthday.setCellValueFactory(new PropertyValueFactory<User, String>("born"));
        columbrowser.setCellValueFactory(new PropertyValueFactory<User, String>("browse"));
        
        
        

    }
	
	
	
	
	
	
	
	
	
	
    	/*Object evt = event.getSource();
    	
    	if(evt.equals(btnsing)) {
    		
    		if(!txtUsername.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
    			
    			String username1 = txtUsername1.getText();
    			String pass1 = txtPasword1.getText();
    		}else {
    			JOptionPane.showMessageDialog(null, "starting failure2", "WARNING", JOptionPane.WARNING_MESSAGE);
    		}
    		
    		
    	}
    	
		
    }*/
}
