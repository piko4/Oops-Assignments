package employee;

import java.util.LinkedList;



//The Employee Assignment

//Create a menu based console application for holding the data of the Employees in an Organisation.  
//The details of the Employee entered by the user from the console
//will be stored in a doubly linked list which can be then traversed by the user by choosing the appropriate menu selection. 
//Each sub menu of the section will loop until the Exit to Main Menu option is not selected.

//1. Add an Employee
//	a. Manager
//	b. Engineer
//	c. Sales Person
//	d. Exit to Main Menu
//2. Display
//	a. All Employees
//	b. First Employee
//	c. Next Employee
//	d. Previous Employee
//	e. Last Employee
//	f. Exit to Main Menu
//3. Sort
//	a. All Managers
//	b. All Engineers
//	c. All Sales Person
//	d. All Employees Alphabetic order ascending
//	e. All Employees Alphabetic order descending
//	f. Exit to Main Menu
//4. Save to File
//5. Load from File
//6. Exit

public class Employee
{
    public class Manager extends Employee
    {

    }

    public class Engineer extends Employee
    {

    }

    public class SalesPerson extends Employee
    {

    }

    public static void menuDisplay()
    {
	System.out.println("1. Add an Employee");
	System.out.println("2. Display");
	System.out.println("3. Sort");
	System.out.println("4. Save to File");
	System.out.println("5. Load from File");
	System.out.println("6. Exit");
	int menuSelected =  ConsoleInput.getInt();
    }

    public static void main(String[] args)
    {
	LinkedList<Employee> employeeList = new LinkedList<Employee>();
	
	
	    Employee.menuDisplay();
	

    }
}
