package Coding2Package;
import java.time.LocalDate;

public class driverEmployee {
	
	public static void main(String[] args) {
//		creating birthday objects using type date (need to follow constructors format from date.java)
		date birthday1= new date(8,26,1960);
		date birthday2 = new date();//default no value, we will give value
		
		birthday2.setmonth(10);
		birthday2.setday(7);
		birthday2.setyear(1970);
		
		date birthday3 = new date();
		birthday3.setmonth(2);
		birthday3.setday(25);
		birthday3.setyear(1980);
	// give array a size basing on the constructor format
		employee[]employeeArr= new employee[3]; 
	// create employee variables for the array	
		employee employee1 = new employee (birthday1, "Andrew", 102.3);
		employee employee2 = new employee (birthday2, "John", 1000.00);
		employee employee3 = new employee (birthday3, "Ari", 300.00);
	// give array values using index	
		employeeArr[0] = employee1;
		employeeArr[1] = employee2;
		employeeArr[2] = employee3;
	//create loop to print all employees in the array using Alldata methode in the employee.java
		for (int i=0; i< employeeArr.length; i++) {
			employeeArr[i].Alldata();
		}
	//use import LocalDate to get current month	
		LocalDate today = LocalDate.now();//getting today's date
		int thisMonth = today.getMonth().getValue();//getting today's month -> getMonth = October -> getValue converts into numerical 10
	
		for (int i=0; i < employeeArr.length; i++) {
			if (employeeArr[i].getbirthDate().getmonth() == thisMonth) {//employeeArr[i] is of class employee, using .getbirthDate converts into a date class, therefore letting us use .getmonth from the date class
				employeeArr[i].setsalary(100.00 + employeeArr[i].getsalary());
				System.out.println("congratz on your birthday, here is the bonus " + employeeArr[i].getsalary());
				
			} else {
				System.out.println("it's not your birthday");
			}
		}
}
	
}
