package employee;

import java.util.Iterator;
import java.util.LinkedList;

import Arrays.ConsoleInput;

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

//-------------Manager-----------------------
class Manager extends Employee
{
    public int hrqScore;

    public Manager(String name, String role, String address, String gender, double basicSalary, int age, int hrqScore)
    {
	this.name = name;
	this.role = role;
	this.address = address;
	this.gender = gender;
	this.basicSalary = basicSalary;
	this.age = age;
	this.hrqScore = hrqScore;
	System.out.println("new Manager added...");
    }
}

// -------------Engineer-----------------------
class Engineer extends Employee
{
    int overtime;

    public Engineer(String name, String role, String address, String gender, double basicSalary, int age, int overtime)
    {
	this.name = name;
	this.role = role;
	this.address = address;
	this.gender = gender;
	this.basicSalary = basicSalary;
	this.age = age;
	this.overtime = overtime;
	System.out.println("new Engineer added...");
    }
}

// ----------------Sales person--------------------
class SalesPerson extends Employee
{
    int commission;

    public SalesPerson(String name, String role, String address, String gender, double basicSalary, int age,
	    int commission)
    {
	this.name = name;
	this.role = role;
	this.address = address;
	this.gender = gender;
	this.basicSalary = basicSalary;
	this.age = age;
	this.commission = commission;
	System.out.println("new SalesPerson added...");
    }
}

// ---------------- Employee --------------------
public class Employee
{
    String name, address, gender, role;
    double basicSalary;
    int age;

    // -------------------------MenuDisplay-------------------------------------------------
    public static String menuDisplay()
    {
	{
	    System.out.println("1. Add an Employee");
	    System.out.println("2. Display");
	    System.out.println("3. Sort");
	    System.out.println("4. Save to File");
	    System.out.println("5. Load from File");
	    System.out.println("6. Exit");
	}
	String menuSelected = ConsoleInput.getString();

	String result;

	switch (menuSelected)
	{
	case "1":
	    {
		{
		    System.out.println("1. Add an Employee");
		    System.out.println("\ta. Manager");
		    System.out.println("\tb. Engineer");
		    System.out.println("\tc. Sales Person");
		    System.out.println("\td. Exit to main menu");
		}
		String subMenu1Selected = ConsoleInput.getString();

		result = switch (subMenu1Selected)
		{
		case "a" -> "1a"; // add manager

		case "b" -> "1b"; // b add Engineer

		case "c" -> "1c"; // c add sales person

		case "d" -> menuDisplay();

		default -> throw new IllegalArgumentException("Unexpected value: " + menuSelected);

		};
		return result;
	    }

	case "2":
	    {
		{
		    System.out.println("2. Display");
		    System.out.println("\ta. All Employees");
		    System.out.println("\tb. First Employee");
		    System.out.println("\tc. Next Employee");
		    System.out.println("\td. Previous Employee");
		    System.out.println("\te. Last Employee");
		    System.out.println("\tf. Exit to Main Menu");
		}
		String subMenu2Selected = ConsoleInput.getString();

		result = switch (subMenu2Selected)
		{
		case "a" -> "2a";
		case "b" -> "2b";
		case "c" -> "2c";
		case "d" -> "2d";
		case "e" -> "2e";
		case "f" -> menuDisplay();
		default -> throw new IllegalArgumentException("Unexpected value: " + subMenu2Selected);
		};
		return result;
	    }

	case "3":
	    {
		{
		    System.out.println("3. Sort");
		    System.out.println("\ta. All Managers");
		    System.out.println("\tb. All Engineers");
		    System.out.println("\tc. All Sales Person");
		    System.out.println("\td. All Employees Alphabetic order ascending");
		    System.out.println("\te. All Employees Alphabetic order descending");
		    System.out.println("\tf. Exit to Main Menu");
		}
		String subMenu3Selected = ConsoleInput.getString();

		switch (subMenu3Selected)
		{
		case "a":
		    {
		    }
		    break;
		case "b":
		    {
		    }
		    break;
		case "c":
		    {
		    }
		    break;
		case "d":
		    {
		    }
		    break;
		case "e":
		    {
		    }
		    break;
		case "f":
		    menuDisplay();
		    break;
		default:
		    throw new IllegalArgumentException("Unexpected value: " + menuSelected);
		}

	    }
	    break;
	case "4":
	    // save to file
	    break;
	case "5":
	    // load from file
	    break;
	case "6":

	    return "exit";

	default:
	    System.out.println("Invalid input try again");
	    menuDisplay();
	}
	return "";

    }

    // ------------------------------------getManager
    public static Employee setManger()
    {
	System.out.println("Enter name : ");
	String name = ConsoleInput.getString();

	System.out.println("Enter address : ");
	String address = ConsoleInput.getString();

	System.out.println("Enter Gender : ");
	String gender = ConsoleInput.getString();

	System.out.println("Enter basic salary : ");
	double basicSalary = ConsoleInput.getFloat();

	System.out.println("Enter age : ");
	int age = ConsoleInput.getInt();

	System.out.println("Enter HRQ Score : ");
	int hrqscore = ConsoleInput.getInt();

	return new Manager(name, "Manager", address, gender, basicSalary, age, hrqscore);
    }

    // ------------------------------------getEngineer
    public static Employee setEngineer()
    {
	System.out.println("Enter name : ");
	String name = ConsoleInput.getString();

	System.out.println("Enter address : ");
	String address = ConsoleInput.getString();

	System.out.println("Enter Gender : ");
	String gender = ConsoleInput.getString();

	System.out.println("Enter basic salary : ");
	double basicSalary = ConsoleInput.getFloat();

	System.out.println("Enter age : ");
	int age = ConsoleInput.getInt();

	System.out.println("Enter overtime : ");
	int overtime = ConsoleInput.getInt();

	return new Engineer(name, "Engineer", address, gender, basicSalary, age, overtime);
    }

    // ------------------------------------getSalesPerson
    public static Employee setSalesPerson()
    {
	System.out.println("Enter name : ");
	String name = ConsoleInput.getString();

	System.out.println("Enter address : ");
	String address = ConsoleInput.getString();

	System.out.println("Enter Gender : ");
	String gender = ConsoleInput.getString();

	System.out.println("Enter basic salary : ");
	double basicSalary = ConsoleInput.getFloat();

	System.out.println("Enter age : ");
	int age = ConsoleInput.getInt();

	System.out.println("Enter commission : ");
	int commission = ConsoleInput.getInt();

	return new SalesPerson(name, "SalesPerson", address, gender, basicSalary, age, commission);
    }

    public static void displayAllEmployees(LinkedList<Employee> employeeList)
    {
	for (Employee employee : employeeList)
	{
	    if (employee instanceof Manager manager)
		System.out.println("------------------\n\tRole : " + manager.role + "\nName : " + manager.name
			+ "\nAddress : " + manager.address + "\nAge : " + manager.age + "\nGender :  " + manager.gender
			+ "\nBasic salary : " + manager.basicSalary + "\nHRQ score : " + manager.hrqScore
			+ "\n------------------");

	    if (employee instanceof Engineer engineer)
		System.out.println("------------------\nName : " + engineer.name + "\nAddress : " + engineer.address
			+ "\nAge : " + engineer.age + "\nGender :  " + engineer.gender + "\nBasic salary : "
			+ engineer.basicSalary + "\nOvertime : " + engineer.overtime + "\n------------------");
	    if (employee instanceof SalesPerson salesPerson)
		System.out.println("------------------\nName : " + salesPerson.name + "\nAddress : "
			+ salesPerson.address + "\nAge : " + salesPerson.age + "\nGender :  " + salesPerson.gender
			+ "\nBasic salary : " + salesPerson.basicSalary + "\nCommission : " + salesPerson.commission
			+ "\n------------------");
	}
    }

    public static void displayEmployee(Employee employee)
    {
	 if (employee instanceof Manager manager)
		System.out.println("------------------\n\tRole : " + manager.role + "\nName : " + manager.name
			+ "\nAddress : " + manager.address + "\nAge : " + manager.age + "\nGender :  " + manager.gender
			+ "\nBasic salary : " + manager.basicSalary + "\nHRQ score : " + manager.hrqScore
			+ "\n------------------");

	    if (employee instanceof Engineer engineer)
		System.out.println("------------------\nName : " + engineer.name + "\nAddress : " + engineer.address
			+ "\nAge : " + engineer.age + "\nGender :  " + engineer.gender + "\nBasic salary : "
			+ engineer.basicSalary + "\nOvertime : " + engineer.overtime + "\n------------------");
	    if (employee instanceof SalesPerson salesPerson)
		System.out.println("------------------\nName : " + salesPerson.name + "\nAddress : "
			+ salesPerson.address + "\nAge : " + salesPerson.age + "\nGender :  " + salesPerson.gender
			+ "\nBasic salary : " + salesPerson.basicSalary + "\nCommission : " + salesPerson.commission
			+ "\n------------------");
    }

    // ---------------------------- M a i n -------------------------------------

    public static void main(String[] args)
    {
	LinkedList<Employee> employeeList = new LinkedList<Employee>();

	String result;
	
	int i=0;
	do
	{

	    result = Employee.menuDisplay();
	    switch (result)
	    {
	    case "exit" -> System.out.println("exited...");

	    case "1a" -> // add manager
		{
		    employeeList.add(Employee.setManger());
		}
	    case "1b" -> // add engineer
		{
		    employeeList.add(Employee.setEngineer());
		}
	    case "1c" -> // add sales guy
		{
		    employeeList.add(Employee.setSalesPerson());
		}
	    case "2a" -> // Display All
		{
		    Employee.displayAllEmployees(employeeList);
		}
	    case "2b" -> // Display first
		{
		    Employee.displayEmployee(employeeList.getFirst());
		}
	    case "2c" -> // Display next
		{
		    Employee.displayEmployee(employeeList.get(0+i)); 
		    i++;
		}

	    default -> System.out.println("invalid option");

	    }
	} while (result != "exit");

    }

   
}
