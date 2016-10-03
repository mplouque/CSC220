import java.io.*;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		//create two objects using the constructor of the Employee class
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Jane Doe");
		
		//use the methods(functions to set information about them.)
		empOne.empAge(26);
		empOne.empDesignation("senior bullshit expert");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(2);
		empTwo.empDesignation("junior bullshit expert");
		empTwo.empSalary(100);
		empTwo.printEmployee();
	}
}