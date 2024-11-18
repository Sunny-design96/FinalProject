package library;

import java.util.ArrayList;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		//creating instances for books and magazines
		Book bookA = new Book ("9-780375-704024","Norwegian Wood",1987,"Haruki Murakami","novel",17,false);
		Book bookB = new Book ("9-780553-293357","Foundation",2004,"Isaac Assimov","Sci-Fi",10,true);
		Magazine magazineC = new Magazine ("0013-0613","Envy of the World",2024, "AllJournalists","economics journal", "economist",10);
		Magazine magazineD = new Magazine ("1044-6613","Amazon",2024,"Doug Tallamy","science journal","National Geographic",10);
		
		Library libraryShelf = new Library();//creating instance for library class, a container that will hold and magazine
		//creating list for permissions and users
		ArrayList<String> permissions=new ArrayList<>();
		ArrayList<User> users = new ArrayList<>();
		//create constructor parameter for each object - librarian, admin and member
		Librarian librarianA = new Librarian (002,"Yami","librarian", 'm',"archiver", "storing&sorting");
		Admin adminB = new Admin (003,"Henry","administrator",'m',2,permissions);
		Member memberC= new Member (004,"Lien","borrower",'f',4);
		//creating searcher and reserver object
		ItemSearcher search = new ItemSearcher();
		ItemReserver reserve= new ItemReserver();
		//create method to add item to the shelf
		libraryShelf.addItems(bookA);
		libraryShelf.addItems(bookB);
		libraryShelf.addItems(magazineC);
		libraryShelf.addItems(magazineD);
		//create method to add users to the users list
		users.add(adminB);
		users.add(memberC);
		users.add(librarianA);
		//create method to display all items that are currently in the library inventory
		libraryShelf.displayItem();
		System.out.println("-------------");
		librarianA.sortLetter(libraryShelf.getList());//create sortLetter method to sort libraryShelf alphabetically using libraryList
		libraryShelf.displayItem();//create method to display the now sorted list of items in the library
	
		
		
		
		
	}

}
