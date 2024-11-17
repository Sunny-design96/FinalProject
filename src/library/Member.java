package library;

import java.util.List;

public class Member extends User{
	private	int limitOfitems;
	private List<LibraryItem> basket;
	private int books=0;
	private int magazines=0;
	private int total=books+magazines;
	
	
	public Member(int ID,String name, String role,char gender, int limitOfitems) {
		super(ID,name,role,gender);
		this.limitOfitems= limitOfitems;
		
	}
	public int getLimitofItems() {
		return limitOfitems;
	}
	
	public void setLimitofItems(int limitOfitems) {
		this.limitOfitems= limitOfitems;
	}

	public void displayAll() {
		System.out.println();
	}
	public void takeItem(LibraryItem item, List<LibraryItem> listShelf) {
		if (total < limitOfitems) {
			if (item.getClass()==Book.class) {
				listShelf.remove(item);
				basket.add(item);
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
	public void returnItem(LibraryItem item, List<LibraryItem> listShelf) {
		if(total>0) {	
			if (item.getClass()==Book.class) {
				basket.remove(item);
				listShelf.add(item);
				books--;
			}
			else if (item.getClass()==Magazine.class) {
				basket.remove(item);
				listShelf.add(item);
				magazines--;
			}
		}else {
		System.out.println("there is no item in your basket currently");
		}
	}
	public void showBasket() {
		System.out.println("there are " + books + " books in your basket");
		System.out.println("there are " + magazines + " magazines in your basket");
	}
}
	
		
		

