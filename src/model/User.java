package model;

public class User {
	
	private String username;
	private String password;
	private String profile;
	private String gender;
	private Career career;
	private String born;
	private Browser browse;
	



public User(String username, String password,String profile,String gender,Career career,String born,Browser browse){

	this.username = username;
	this.password = password;
	this.profile = profile;
	this.gender = gender;
	this.career = career;
	this.born = born;
	this.browse = browse;
	
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

	public Career getCareer() {
		return career;
	}

	public void setCareer(Career career) {
		this.career = career;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	public Browser getBrowse() {
		return browse;
	}

	public void setBrowse(Browser browse) {
		this.browse = browse;
	}
	@Override
	public String toString() {
		return  username+ " ,"  + password + " ," + profile + " ," + gender +" ,"+ career + " ,"+ born + " ,"+ browse;
	}
	
	
}
