package model;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image; 

public class Classroom {
	
	private List<User>user;

	public Classroom() {
		
		user = new ArrayList<>();
	}
	
	public void addUser(String username, String password,String profile,String gender,String career,String born,String browse, Image photo) {
		user.add(new User( username,  password, profile, gender, career, born, browse, photo));
	}

	
	
		
}
	
	
	

