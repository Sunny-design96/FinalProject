package Coding2Package.onlineStore;

public class Electronics extends Product {//subclass with extends
		String Type;
		String Name;

		public Electronics (int ID, double Price, String Type, String Name) {
			super(ID, Price);// parent cant take variables and method from subordinate, but subordinate can, hence super.
			this.Type= Type;// this.type means we want the current value of our variables.
			this.Name= Name;
}
		public String getType() {
			return Type;
}
		public String getName() {
			return Name;
}
		public void setType (String Typeplaceholder) {
			this.Type= Typeplaceholder;	
}
		public void setName (String Nameplaceholder) {
			this.Name= Nameplaceholder;
}
		public void Alldata () {
	super.Alldata();//super prints the ID and Price bc what parent has in the method= overriding.
	System.out.println("type is " + Type);
	System.out.println("Name is " + Name);
}
@Override
public void applyDiscount() {
	
	
}
}
