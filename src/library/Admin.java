package library;

import java.util.List;

public class Admin extends User {
	private int accessLevel;
	private List<String>permissions;
	//create constructor
	public Admin (int ID, String name, String role, char gender, int accessLevel, List<String>permissions) {
		super (ID,name,role,gender);
		this.accessLevel= accessLevel;
		this.permissions= permissions;		
	}
	//create accessor method
	public int getaccessLevel(){
		return accessLevel;
	}
	public List<String> getPermissions(){
		return permissions;
	}
	//create mutator method
	public void setaccessLevel(int accessLevel) {
		this.accessLevel= accessLevel;
	}
	public void setPermissions(List<String> permissions) {
		this.permissions= permissions;
	}
	//method to check the accessLevel of user
	public void displayInformation(List<User> users) {
		if (accessLevel > 0) {
			for(User user: users) {
				user.displayAll(); 
			}
		}else {
			System.out.println("low access level");
		}
	}
	public void removeUser(List<User> users,User account) {
		
		if (accessLevel>1) {//if statement to check what admin can do
			if(users.contains(account)) {
				users.remove(account);
			
			}
		}
	}
}

