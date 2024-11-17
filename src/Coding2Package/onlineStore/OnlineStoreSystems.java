package Coding2Package.onlineStore;

import java.util.ArrayList;
import java.util.List;

public class OnlineStoreSystems {

	public static void main(String[] args) {
		Electronics headphone= new Electronics (1, 45.3, "A", "M2mini");
		Electronics computer= new Electronics (2, 200.5, "gaming", "Asus");
		Electronics TV = new Electronics (3, 300.4, "flat", "Samsung");
		
		Clothing pants = new Clothing (1234, 50.00, "Jeans", "black");
		Grocery meats = new Grocery (2345, 10.50, "steak", true);
		
		ShoppingCart shoppingCart = new ShoppingCart();//initializing list/shopping cart
		shoppingCart.addProduct(headphone);//adding value to the list
		shoppingCart.addProduct(pants);
		shoppingCart.addProduct(meats);
		
		shoppingCart.DisplayItem();
		
		shoppingCart.removeProduct(headphone);
		shoppingCart.addProduct(TV);
		
		shoppingCart.DisplayItem();
		
		
		
	}
	
}
