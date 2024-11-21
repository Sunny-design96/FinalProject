package creational;

public class MagazineFactory extends LibraryItemFactory{
    String type;
	String publisher;
	int	month;
	// create cosntructore
	public MagazineFactory(String ISBN, String Title, int Year, String Author,String type, String publisher, int month) {
		super(ISBN, Title, Year, Author);
		this.type= type;
		this.publisher= publisher;
		this.month= month;
	}
	//create accessor method
	public String getType() {
		return type;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getMonth() {
		return month;
	}
	//create mutator method
	public void setType(String type) {
		this.type= type;
	}
	public void setPublisher(String publisher) {
		this.publisher= publisher;
	}
	public void setMonth(int month) {
		this.month= month;
	}
    
    public String toString() {//method to show all data, ensuring that shared attributes are displayed
        return  super.toString() + "\n type is " + this.type + "\n publisher is " + this.publisher + "\n the published month is " + month;
	}
}
