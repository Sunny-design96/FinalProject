package Coding2Package.onlineStore;

// implements discountable are added after creating interface class.
public abstract class Product implements discountable {// abstract= it lets you modify the method of the parents (modifiable)
	int ID;
	double Price;

public Product (int ID, double Price) {
	this.ID = ID;
	this.Price= Price;	
}
public Product () {
	this.ID= 0;
	this.Price= 0.00;	
}
public int getID() {
	return ID;	
}
public double getPrice() {
	return Price;
}
public void setID(int IDplaceholder) {
	this.ID= IDplaceholder;	
}
public void setPrice (double Priceplaceholder) {
	this.Price= Priceplaceholder;
}

public void Alldata () {
	System.out.println("ProductID is " + ID);
	System.out.println("ProductPrice is " + Price);	
}

}
