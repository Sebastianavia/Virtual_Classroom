package model;

public class Career {
	private String name;
	
	public Career(String name) {
		super();
		this.name = name;
	}
	public Career() {}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
