package Coding2Package.onlineStore;

public class Clothing extends Product {
	String type;
	String color;

	public Clothing (int ID, double Price, String type, String color) {
		super (ID, Price);
		this.type= type;
		this.color= color;
	}
	public Clothing() {
		this.type= "";
		this.color="";		
	}
	public String getType() {
		return type;
		
	}
	public String getColor() {
		return color;
	}
	public void setType(String TypePlaceholder) {
		this.type= TypePlaceholder;	
	}
	public void setColor(String ColorPlaceholder) {
		this.color= ColorPlaceholder;
	}
	public void Alldata() {
		super.Alldata();
		System.out.println("type is " + type);
		System.out.println("color is " + color);
	}
	@Override 
	public void applyDiscount() {
		// TODO Auto-generated method stub
		
	}
}
