package model;

import javafx.scene.image.Image;

public class User {
	
	private String username;
	private String password;
	private String profile;
	private String gender;
	private String career;
	private String born;
	private String browse;
	private Image photo;
	



public User(String username, String password,String profile,String gender,String career,String born,String browse, Image photo){

	this.username = username;
	this.password = password;
	this.profile = profile;
	this.gender = gender;
	this.career = career;
	this.born = born;
	this.browse = browse;
	this.photo = photo;
	
}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	public String getBrowse() {
		return browse;
	}

	public void setBrowse(String browse) {
		this.browse = browse;
	}
	
	
	@Override
	public String toString() {
		return  username+ " ,"  + password + " ," + profile + " ," + gender +" ,"+ career + " ,"+ born + " ,"+ browse;
	}
	
	
}
