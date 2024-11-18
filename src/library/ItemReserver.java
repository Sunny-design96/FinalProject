package library;

import java.util.ArrayList;
import java.util.List;

public class ItemReserver {
	List<User> waitList = new ArrayList<>(); //initializing list
	//method to reserve title
	public void reserveTitle(List<LibraryItem> listShelf, String title,User users) {
		for (LibraryItem item: listShelf) {
			//if-statement checks for title and if it is borrowed
			if (item.getTitle().equalsIgnoreCase(title)&& item.isBorrowed()){// isBorrowed is false by default
				waitList.add(users);//add user to the waitList
			}
		}
		//check if book is there and the status
		System.out.println("no item with " + title + "is reservable");
		}
	public void unreserveTitle(List<LibraryItem> listShelf, String title, User users) {
		for (LibraryItem item: listShelf) {
			if(item.getTitle().equalsIgnoreCase(title)&&!item.isBorrowed()) {
				waitList.remove(users);
			}
		}
	}
	//method to show people on waiting list
	public void showWaitList(){
		for(User users : waitList) {
			System.out.println(users.getID()+" " + users.getName());
		}
	}
}
