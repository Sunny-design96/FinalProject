package library;

public class Magazine extends LibraryItem {
	String type;
	String publisher;
	int	month;
	
	public Magazine(String ISBN, String Title, int Year, String Author,String type, String publisher, int month) {
		super(ISBN, Title, Year, Author);
		this.type= type;
		this.publisher= publisher;
		this.month= month;
	}
	public String getType() {
		return type;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getMonth() {
		return month;
	}
	public void setType(String type) {
		this.type= type;
	}
	public void setPublisher(String publisher) {
		this.publisher= publisher;
	}
	public void setMonth(int month) {
		this.month= month;
	}
	public void allData() {
		super.allData();
		System.out.println("type is " + type);
		System.out.println("publisher is " + publisher);
		System.out.println("the published month is " + month);
	}
	
	
	

}
