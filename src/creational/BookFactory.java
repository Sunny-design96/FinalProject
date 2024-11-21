package creational;

public class BookFactory extends LibraryItemFactory{
    String genre;
	int ageRating;
	boolean isDigital;
	//create constructor
	public BookFactory (String ISBN, String Title, int Year, String Author, String genre, int ageRating, boolean isDigital) {
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
	public String toString() {
        String details;
        if(isDigital){
            details =  super.toString() + "\n genre is " + this.genre + "\n ageRating is " + this.ageRating + "\n This is a digital book";
        }else{
            details = super.toString() + "\n genre is " + this.genre + "\n ageRating is " + this.ageRating + "\n This is a physical book";
        }
		return details;
	}
}
