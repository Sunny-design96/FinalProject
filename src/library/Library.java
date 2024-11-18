package library;
import java.util.ArrayList;
import java.util.List;
public class Library {
	private List<LibraryItem>LibraryList;
	//create constructor
	public Library() {	
		//initialize Library
		LibraryList= new ArrayList<>();//creates empty Arraylist to store libraryItems
	}
	//accessor method
	public List<LibraryItem> getList(){//access the libraryList
		return LibraryList;
	}
	public void addItems(LibraryItem item) {//create method to add item to the list
		LibraryList.add(item);
		System.out.println("Item ID" + item.getISBN() + "has been added to the Library");
	}
	public void removeItems(LibraryItem item) {//create method to remove item from the list
		LibraryList.remove(item);
		System.out.println("Item ID" + item.getISBN()+ "has been removed from the library");
	}
	//method 
	public void displayItem() {
		for(int i=0; i<LibraryList.size();i++) {//iterating through the list, retrieves number of ites in the list
			LibraryList.get(i).allData();//calls all data method on current item - polymorphism
			System.out.println();
		}
	}
}
