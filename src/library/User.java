package library;

public class User {//declare variables
	private int ID;
	private String name;
	private String role;
	private char gender;
	//create constructor
	public User(int ID, String name, String role, char gender) {
		this.ID= ID;
		this.name= name;
		this.role= role;
		this.gender= gender;
	}
	//create accessor method
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public char getGender() {
		return gender;
	}
	//create mutator method
	public void setID (int ID) {
		this.ID=ID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public void setGender(char gender) {
	}
	//create method to display all relevant detail of an object
	public void displayAll() {
		System.out.println("ID is " + ID);
		System.out.println("name is " + name);
		System.out.println("role is " + role);
		System.out.println("gender is " + gender);
	}
	
}
