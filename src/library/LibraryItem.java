package library;

public abstract class LibraryItem implements Borrowable {//creating variables
	String ISBN;
	String Title;
	int Year;
	String Author;
	boolean isBorrowed;
	
	public LibraryItem (String ISBN, String Title, int Year, String Author) {//creating constructor
		this.ISBN= ISBN;
		this.Title= Title;
		this.Year= Year;
		this.Author= Author;
		this.isBorrowed= false;
	}
	public LibraryItem() {//create default constructor
		this.ISBN= "";
		this.Title= "";
		this.Year= 0;
		this.Author= "";
	}
	//create accessor methods
	public String getISBN() {
		return ISBN;
	}
	public String getTitle() {
		return Title;
	}
	public int getYear() {
		return Year;
	}
	public String getAuthor() {
		return Author;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	//@override from interface methods
	public void borrowItem() {
		this.isBorrowed= true;
	}
	public void returnItem() {
		this.isBorrowed= false;
	}
	//create mutator methods
	public void setISBN(String ISBNplaceHolder) {
		this.ISBN= ISBNplaceHolder;	
	}
	public void setTitle(String titleplaceHolder) {
		this.Title= titleplaceHolder;
	}
	public void setyear(int yearPlaceHolder) {
		this.Year = yearPlaceHolder;
	}
	public void setAuthor (String authorPlaceHolder) {
		this.Author= authorPlaceHolder;
	}
	//create methods to show all data
	public void allData() {
		System.out.println("ISBN is " + ISBN);
		System.out.println("Title is " + Title);
		System.out.println("Year is " + Year);
		System.out.println("Author is " + Author);
	}

}

