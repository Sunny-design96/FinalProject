package Coding2Package;

public class employee {
	private date birthDate;
	private String name;
	private double salary;

public employee(date birthDate, String name, double salary) {
	this.birthDate = birthDate;
	this.name = name;
	this.salary = salary;
}
public employee () {
	this.birthDate = null;
	this.name = "";
	this.salary = 0.00;
	
}
public date getbirthDate() {
	return birthDate;
}
public String getname() {
	return name;
}
public double getsalary () {
	return salary;
}
public void setbirthDate (date birthDateholder) {
	this.birthDate = birthDateholder;
}
public void setname (String nameholder) {
	this.name = nameholder;
}
public void setsalary (double salaryholder) {
	this.salary = salaryholder;
}
public void Alldata () {
	System.out.println("name is " + name + " ,birthday is " + birthDate +  " ,salary is " + salary);
}


}
