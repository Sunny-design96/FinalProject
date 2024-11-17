package library;

import java.util.ArrayList;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Book bookA = new Book ("9-780375-704024","Norwegian Wood",1987,"Haruki Murakami","novel",17,false);
		Book bookB = new Book ("9-780553-293357","Foundation",2004,"Isaac Assimov","Sci-Fi",10,true);
		Magazine magazineC = new Magazine ("0013-0613","Envy of the World",2024, "AllJournalists","economics journal", "economist",10);
		Magazine magazineD = new Magazine ("1044-6613","Amazon",2024,"Doug Tallamy","science journal","National Geographic",10);
		
		Library libraryShelf = new Library();
		ArrayList<String> permissions=new ArrayList<>();
		ArrayList<User> users = new ArrayList<>();
		
		Librarian librarianA = new Librarian (002,"Yami","librarian", 'm', "archiver", "storing&sorting");
		
		Admin adminB = new Admin (003,"Henry","administrator",'m',2,permissions);
		
		Member memberC= new Member (004,"Lien","borrower",'f',4);
		
		ItemSearcher search = new ItemSearcher();
		ItemReserver reserve= new ItemReserver();
		
		libraryShelf.addItems(bookA);
		libraryShelf.addItems(bookB);
		libraryShelf.addItems(magazineC);
		libraryShelf.addItems(magazineD);
		
		users.add(adminB);
		users.add(memberC);
		users.add(librarianA);
		
		libraryShelf.displayItem();
		System.out.println("-------------");
		librarianA.sortLetter(libraryShelf.getList());
		libraryShelf.displayItem();
	
		
		
		
		
	}

}
