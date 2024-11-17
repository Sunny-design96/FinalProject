package Coding2Package;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	String birthday;
	
	
	
	public Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	public Person(String first, String last, int agePerson, String birthdayPerson) {
		this.firstName = first;
		this.lastName = last;
		this.age = agePerson;
		this.birthday = birthdayPerson;
	}
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.birthday= "";
		
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getBirthday() {
		return birthday;
	}
	
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	public void setLastName(String last) {
		this.lastName = last;
	}
	public void setAge (int age) {
		this.age= age;
	}
	public void setBirthday (String birthday) {
		this.birthday= birthday;
	}
	public void printFirstName() {
		System.out.println("First name is: " + firstName);
	}
	
	public void printLastName() {
		System.out.println("Last name is: " + lastName);
	}
	
	public void printFullName() {
		System.out.println("Full name is: " + firstName + " " + lastName);
	}
	public void printAge () {
		System.out.println("person's age is" + age);
	}
	public void printBirthday () {
		System.out.println("person's birthday is" + birthday);
	}
	public void allData () {
		System.out.println("person's complete data is " + firstName + " " + lastName + " " + age + " " + birthday);
	}
	public static void main(String[]args) {
		Person person1 = new Person();
		person1.setFirstName("Timothy");
		person1.setLastName("B");
		
		Person person2 = new Person("Robert","A");
		
		Person person3 = new Person();
		person3.setFirstName("Sebastian");
		person3.setLastName("C");
		
		Person person4 = new Person("Andrew","Bertiz",50, "26-08-1974");
		person4.allData ();
		
		

	}
}
