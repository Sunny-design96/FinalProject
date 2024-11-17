package Coding2Package;

public class Cat {
String name;
String color;
String breed;

public Cat (String name, String color, String breed) {
	this.name= name;
	this.color = color;
	this.breed= breed;	
}
public Cat () {
	this.name= "";
	this.color="";
	this.breed="";
	
}
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public String getBreed() {
	return breed;
}
public void setName (String namePlaceholder) {
	this.name= namePlaceholder;
}
public void setColor(String colorPlaceholder) {
	this.color= colorPlaceholder;
	
}
public void setBreed(String breedPlaceholder) {
	this.breed= breedPlaceholder;
}
public void printName() {
	System.out.println("name is "+ name);
}
public void printColor() {
	System.out.println("color is "+ color);
}
public void printBreed() {
	System.out.println("breed is "+ breed);
}
public static void main (String args[]) {
	Cat cat1 =  new Cat ("Cookie", "grey", "shorthair");
	Cat cat2 = new Cat ();
	
	System.out.println(cat1.getName());
	cat1.printName();

	cat2.setName("andrew");	
	cat2.setColor("brown");
	cat2.setBreed("tuxedo");
	cat2.printName();
	System.out.println(cat1.getName());
}
}
