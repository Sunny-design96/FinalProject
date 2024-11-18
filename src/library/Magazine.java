package library;

public class Magazine extends LibraryItem {
	String type;
	String publisher;
	int	month;
	// create cosntructore
	public Magazine(String ISBN, String Title, int Year, String Author,String type, String publisher, int month) {
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
	public void allData() {//method to show all data, ensuring that shared attributes are displayed
		super.allData();//call a method in parents class
		System.out.println("type is " + type);
		System.out.println("publisher is " + publisher);
		System.out.println("the published month is " + month);
	}
	
	
	

}
