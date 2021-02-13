package model;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image; 

public class Classroom {
	
	private List<User>users;

	public Classroom() {
		
		users = new ArrayList<>();
	}
	
	public void addUser(String username, String password,String profile,String gender,String career,String born,String browse, Image photo) {
		users.add(new User( username,  password, profile, gender, career, born, browse, photo));
	}

	
	public List<User> getUsers() {
		return users;
	}
		
}
	
	
	

