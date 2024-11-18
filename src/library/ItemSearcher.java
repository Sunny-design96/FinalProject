package library;
import java.util.ArrayList;
import java.util.List;
public class ItemSearcher {
	//design a class and method  to search for LibraryItem by title, authors and year
	private List<LibraryItem> searchTitle(List<LibraryItem> listShelf, String itemTitle){
		List<LibraryItem> newList = new ArrayList<>();//create a temporary list to store the libraryItems that match the search criteria
		for (LibraryItem item : listShelf) {//iterate through each libraryItem object in the listShelf
			if (item.getTitle().equalsIgnoreCase(itemTitle)){//check title match
				newList.add(item);//if match, add item to list
			}
		}	
		return newList;	
	}	
	private List<LibraryItem> searchAuthor(List<LibraryItem> listShelf, String authorName){
		List<LibraryItem> newList= new ArrayList<>();
		for (LibraryItem item: listShelf) {
			if (item.getAuthor().equalsIgnoreCase(authorName)) {
				newList.add(item);
			}
		}
	
		return newList;
	}
	private List<LibraryItem> searchYear(List<LibraryItem> listShelf, int year){
		List<LibraryItem> newList = new ArrayList<>();
		for (LibraryItem item: listShelf) {
			if (item.getYear() == year) {
				newList.add(item);
			}
		}
		return newList;
	}

}