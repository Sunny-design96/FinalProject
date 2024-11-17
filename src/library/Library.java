package library;
import java.util.ArrayList;
import java.util.List;
public class Library {
	private List<LibraryItem>LibraryList;
	
	public Library() {
		LibraryList= new ArrayList<>();
	}
	public List<LibraryItem> getList(){
		return LibraryList;
	}
	public void addItems(LibraryItem item) {
		LibraryList.add(item);
		System.out.println("Item ID" + item.getISBN() + "has been added to the Library");
	}
	public void removeItems(LibraryItem item) {
		LibraryList.remove(item);
		System.out.println("Item ID" + item.getISBN()+ "has been removed from the library");
	}
	public void displayItem() {
		for(int i=0; i<LibraryList.size();i++) {
			LibraryList.get(i).allData();
			System.out.println();
		}
	}
}
