package Coding2Package.onlineStore;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
	
	private List<Product> Products;// giving it a name
	
	public ShoppingCart() {//initializing (just start the list), dont need to give size/value, it s not the same as array with name size value
		Products= new ArrayList<>();//name, almost like constructor, just no value given = initializing
	}
	public void addProduct(Product product) {//this is a method that takes any product (class placeholder) product is just a name being added 
		Products.add(product);//.add= built-in method in a List <>
		System.out.println("Product ID " + product.getID() + " has been added to the shopping cart.");
	}
	public void removeProduct (Product product) {
		Products.remove(product);
		System.out.println("Product ID " + product.getID() + "has been removed from the shopping cart.");
	}
	public void DisplayItem() {
		for( int i= 0 ; i<Products.size();i++) {// similar to array.length, in list we use size();
			// for now, cannot display information with list, but display with our classes. Here: Product class, hence we use get method. 
			Products.get(i).Alldata();// in the loop, @i= 0 is the first item, Products.get is to get which product we want so that we can use the Alldata method.
			System.out.println();
		}
	}
}

//we made a list for products, but list cannot use product methods(in the items) (because we didnt create methods in a List), hence we made a for loop to check all items
//Products is a LIST, Products.get() is a Product (class) therefore we could use method now
//since Products.get is a product (class) we can use .allData method