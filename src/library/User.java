package library;

public class User {
	private int ID;
	private String name;
	private String role;
	private char gender;
	
	public User(int ID, String name, String role, char gender) {
		this.ID= ID;
		this.name= name;
		this.role= role;
		this.gender= gender;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getrole() {
		return role;
	}
	public char getGender() {
		return gender;
	}
	public void setID (int ID) {
		this.ID=ID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public void displayAll() {
		System.out.println("ID is " + ID);
		System.out.println("name is " + name);
		System.out.println("role is " + role);
		System.out.println("gender is " + gender);
	}
	
}
