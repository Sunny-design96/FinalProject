package Coding2Package.onlineStore;

public class Grocery extends Product{
	boolean onSale;
	String item;
	
	public Grocery(int ID, double Price, String itemPlaceholder, boolean onSalePlaceholder ) {
		super(ID, Price);
		this.item= itemPlaceholder;
		this.onSale= onSalePlaceholder;
	}
	public Grocery() {
		this.item= "";
		this.onSale= false;
	}
	public String getItem() {
		return item;
	}
	public boolean getonSale() {
		return onSale;
	}
	public void setItem(String itemPlaceholder) {
		this.item= itemPlaceholder;
	}
	public void setonSale(boolean onSalePlaceholder) {
		this.onSale= onSalePlaceholder;
	}
	public void Alldata() {
		super.Alldata();
		System.out.println("this item is "+ item);
		System.out.println("this item is on Sale " + onSale);
	}
	@Override
	public void applyDiscount() {
		// TODO Auto-generated method stub
		
	}
}
