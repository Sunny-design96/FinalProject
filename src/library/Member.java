package library;

import java.util.List;

public class Member extends User{//create class member inheritance from User class
	private	int limitOfitems;//max numebr fo item memebr is allowed to borrow
	private List<LibraryItem> basket;//create List to hold library item objects that member has borrowed
	//initializes the count to 0 to track the number of books and magazines member has borrowed.
	private int books=0;
	private int magazines=0;
	private int total=books+magazines;
	
	
	public Member(int ID,String name, String role,char gender, int limitOfitems) {
		super(ID,name,role,gender);
		this.limitOfitems= limitOfitems;
		
	}
	public int getLimitofItems() {//restrict access to within member class
		return limitOfitems;
	}
	
	public void setLimitofItems(int limitOfitems) {
		this.limitOfitems= limitOfitems;
	}

	public void displayAll() {
		System.out.println();
	}
	//create method to check if totalnumbers of items user has taken is less than the maximum allowed
	public void takeItem(LibraryItem item, List<LibraryItem> listShelf) {
		if (total < limitOfitems) {
			if (item.getClass()==Book.class) {//check type of item
				listShelf.remove(item);//remove item from shelf
				basket.add(item);//add item to basket
				books++;
			}else if(item.getClass()==Magazine.class) {
				listShelf.remove(item);
				basket.add(item);
				magazines++;
			}else{
				System.out.println("this item is not a book or a magazine");
				
			}
		}else {
			System.out.println("can't take anymore item, you have reached the limit");
		}
	}
	//create method to allow a user to return an itemfrom their basket back to listShelf
	//check if the user has any item in the basket before proceeding
	public void returnItem(LibraryItem item, List<LibraryItem> listShelf) {
		if(total>0) {//check the total item in user's possession
			if (item.getClass()==Book.class) {//if statement to remove book from basket and add to shelf
				basket.remove(item);
				listShelf.add(item);
				books--;
			}
			else if (item.getClass()==Magazine.class) {//if statement to remove magazine from basket and add to shelf
				basket.remove(item);
				listShelf.add(item);
				magazines--;
			}
		}else {
		System.out.println("there is no item in your basket currently");
		}		
	}
	public void showBasket() {//method to show the number of books and magazines in the basket
		System.out.println("there are " + books + " books in your basket");
		System.out.println("there are " + magazines + " magazines in your basket");
	}
}
	
		
		

