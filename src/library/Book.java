package library;

public class Book extends LibraryItem{
	String genre;
	int ageRating;
	boolean isDigital;
	//create constructor
	public Book (String ISBN, String Title, int Year, String Author, String genre, int ageRating, boolean isDigital) {
		super(ISBN, Title, Year, Author);
		this.genre= genre;
		this.ageRating= ageRating;
		this.isDigital= isDigital;
	}
	//create accessor method
	public String getGenre() {
		return genre;
	}
	public int getAgeRating() {
		return ageRating;
	}
	public boolean getIsDigital() {
		return isDigital;
	}
	//create mutator method
	public void setGenre(String genre) {
		this.genre= genre;
	}
	public void setAgeRating(int ageRating) {
		this.ageRating= ageRating;
	}
	public void setIsDigital(boolean isDigital) {
		this.isDigital= isDigital;
	}
	//method to show all data
	public void allData() {
		super.allData();
		System.out.println("genre is " + genre);
		System.out.println("ageRating is " + ageRating);
		if(isDigital) {//if statement to show if it s a digital or physical book
			System.out.println("This is a digital book");
		}else {
			System.out.println("This is a physical book");
		}
	}
}
	
