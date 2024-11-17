package library;
import java.util.ArrayList;
import java.util.List;
public class ItemSearcher {
	private List<LibraryItem> searchTitle(List<LibraryItem> listShelf, String itemTitle){
		List<LibraryItem> newList = new ArrayList<>();
		for (LibraryItem item : listShelf) {
			if (item.getTitle().equalsIgnoreCase(itemTitle)){
				newList.add(item);	
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