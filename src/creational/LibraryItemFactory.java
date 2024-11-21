package creational;

import library.Borrowable;

public class LibraryItemFactory implements Borrowable{
    private String ISBN;
	private String Title;
	private int Year;
	private String Author;
	private boolean isBorrowed;
	

	public LibraryItemFactory (String ISBN, String Title, int Year, String Author) {//creating constructor
		this.ISBN= ISBN;
		this.Title= Title;
		this.Year= Year;
		this.Author= Author;
		this.isBorrowed= false;
	}
	public LibraryItemFactory() {//create default constructor
		this.ISBN= "";
		this.Title= "";
		this.Year= 0;
		this.Author= "";
	}
    
    public LibraryItemFactory createItem(String type){
        String item = type.toLowerCase();
        if(item == null || item.isEmpty()){
            return null;
        }
        switch(type){
           case ("no param item"):
           return new LibraryItemFactory();

           case("param item"):
           return new LibraryItemFactory(item, type, Year, item);

           case("book"):
           return new BookFactory(item, item, Year, type, item, Year, isBorrowed);

           case ("magazine"):
           return new MagazineFactory(item, item, Year, item, type, item, Year);
           
           default:
           throw new IllegalArgumentException("Unknown item type: " + type);
        }
       
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
	
	//@override from interface methods
    public boolean isBorrowed() {
		return isBorrowed;
	}
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
	public String toString() {
        return "ISBN is " + this.ISBN + "\nTitle is " + this.Title + "\nYear is " + this.Year + "\nAuthor is " + this.Author;
	}

}


