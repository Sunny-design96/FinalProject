package library;

import java.util.List;

public class ItemReserver {
	public boolean reserveTitle(List<LibraryItem> listShelf, String title) {
		for (LibraryItem item: listShelf) {
			if (item.getTitle().equalsIgnoreCase(title)&& !item.isBorrowed()){ 
				item.borrowItem();
				return true;
			}
		}
		System.out.println("no item with " + title + "is reservable");
		return false;
		}
	public boolean unreserveTitle(List<LibraryItem> listShelf, String title) {
		for (LibraryItem item: listShelf) {
			if(item.getTitle().equalsIgnoreCase(title)&&item.isBorrowed()) {
				item.returnItem();
				return true;
			}
		}
		
		return false;
	}
}
