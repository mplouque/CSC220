import java.io.*;

public class Employee
{
	String name;
	int age;
	String designation;
	double salary;
	
	//constructor
	public Employee(String name)
	{
		this.name =name;
	}
	//assign the age of the employee to a var
	public void empAge(int empAge)
	{
		age = empAge;
	}
	public void empDesignation(String empDesign)
	{
		designation = empDesign;
	}
	public void empSalary(double empSalary)
	{
		salary = empSalary;
	}
	// print the employee details
	public void printEmployee()
	{
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Designation: "+ designation);
		System.out.println("Salary: "+ salary);
	}
	
}