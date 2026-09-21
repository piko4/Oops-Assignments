package employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
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

    public Manager(String name, String address, String gender, double basicSalary, int age, int hrqScore)
    {
	this.name = name;
	this.role = "Manager";
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

    public Engineer(String name, String address, String gender, double basicSalary, int age, int overtime)
    {
	this.name = name;
	this.role = "Engineer";
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

    public SalesPerson(String name, String address, String gender, double basicSalary, int age, int commission)
    {
	this.name = name;
	this.role = "SalesPerson";
	this.address = address;
	this.gender = gender;
	this.basicSalary = basicSalary;
	this.age = age;
	this.commission = commission;
	System.out.println("new SalesPerson added...");
    }
}

// ---------------- Employee --------------------
public class Employee implements Serializable
{
    String name, address, gender, role;
    double basicSalary;
    int age;
    static int i = 0;

    // -------------------------MenuDisplay-------------------------------------------------
    @SuppressWarnings("unchecked")
    public static String menuDisplay(LinkedList<Employee> employeeList) throws IOException, ClassNotFoundException
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

		switch (subMenu1Selected)
		{
		case "a" -> employeeList.add(Employee.setManger()); // add manager

		case "b" -> employeeList.add(Employee.setEngineer()); // b add Engineer

		case "c" -> employeeList.add(Employee.setSalesPerson()); // c add sales person

		case "d" -> menuDisplay(employeeList);

		default -> throw new IllegalArgumentException("Unexpected value: " + menuSelected);

		}

	    }
	    break;
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

		switch (subMenu2Selected)
		{
		case "a" -> Employee.displayAllEmployees(employeeList);
		case "b" -> Employee.displayEmployee(employeeList.getFirst());
		case "c" ->
		    {

			if (i == employeeList.size() - 1)
			{
			    i = employeeList.size() - 1;
			    break;
			}
			Employee.displayEmployee(employeeList.get(i + 1));
			i++;
		    }
		case "d" ->
		    {
			if (i < -1)
			{
			    i = 0;
			    break;
			}
			Employee.displayEmployee(employeeList.get(i - 1));
			i++;
		    }
		case "e" -> Employee.displayEmployee(employeeList.getLast());
		case "f" -> menuDisplay(employeeList);
		default -> throw new IllegalArgumentException("Unexpected value: " + subMenu2Selected);
		}
		;

	    }
	    break;
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
		case "a" -> // sort all managers
		    {
			LinkedList<Employee> e = new LinkedList<>();
			;
			for (Employee employee : employeeList)
			{
			    if (employee.role == "Manager")
				e.add(employee);
			}
			e.sort(Comparator.comparing(Employee::getName));
			for (Employee employee : e)
			{
			    displayEmployee(employee);
			}
		    }
		case "b" -> // sort all Engineers
		    {
			LinkedList<Employee> e = new LinkedList<>();
			;
			for (Employee employee : employeeList)
			{
			    if (employee.role == "Engineer")
				e.add(employee);
			}
			e.sort(Comparator.comparing(Employee::getName));
			for (Employee employee : e)
			{
			    displayEmployee(employee);
			}
		    }
		case "c" -> // sort all sales Person
		    {
			LinkedList<Employee> e = new LinkedList<>();
			;
			for (Employee employee : employeeList)
			{
			    if (employee.role == "SalesPerson")
				e.add(employee);
			}
			e.sort(Comparator.comparing(Employee::getName));
			for (Employee employee : e)
			{
			    displayEmployee(employee);
			}
		    }
		case "d" -> // sorting all in alphabetical order
		    {
			employeeList.sort(Comparator.comparing(Employee::getName));
			displayAllEmployees(employeeList);
		    }
		case "e" -> // sorting all in reverse alphabetical order
		    {
			employeeList.sort(Comparator.comparing(Employee::getName).reversed());
			displayAllEmployees(employeeList);
		    }
		default -> throw new IllegalArgumentException("Unexpected value: " + subMenu3Selected);
		}

	    }
	    break;
	case "4": // save in the file
	    {
		FileOutputStream fos = new FileOutputStream("employees.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employeeList);
		oos.close();
		fos.close();
		System.out.println("File saved..");
	    }
	    break;
	case "5": // load from file
	    {
		FileInputStream fis = new FileInputStream("employees.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		employeeList.clear();
		employeeList.addAll( (LinkedList<Employee>) ois.readObject());
		
		System.out.println("File Loaded..");
		System.out.println(employeeList.size()+" Employees loaded From File..");
		ois.close();
		fis.close();
	    }
	    break;
	case "6":

	    return "exit";

	default:
	    System.out.println("Invalid input try again");
	    menuDisplay(employeeList);
	}
	return "";

    }

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
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

	return new Manager(name, address, gender, basicSalary, age, hrqscore);
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

	return new Engineer(name, address, gender, basicSalary, age, overtime);
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

	return new SalesPerson(name, address, gender, basicSalary, age, commission);
    }

    public static void displayAllEmployees(LinkedList<Employee> employeeList)
    {
	for (Employee employee : employeeList)
	{
	    displayEmployee(employee);
	}
    }

    public static void displayEmployee(Employee employee)
    {
	if (employee instanceof Manager manager)
	    System.out.println("------------------\nRole : " + manager.role + "\nName : " + manager.name
		    + "\nAddress : " + manager.address + "\nAge : " + manager.age + "\nGender :  " + manager.gender
		    + "\nBasic salary : " + manager.basicSalary + "\nHRQ score : " + manager.hrqScore
		    + "\n------------------");

	if (employee instanceof Engineer engineer)
	    System.out.println("------------------\nRole : " + engineer.role + "\nName : " + engineer.name
		    + "\nAddress : " + engineer.address + "\nAge : " + engineer.age + "\nGender :  " + engineer.gender
		    + "\nBasic salary : " + engineer.basicSalary + "\nOvertime : " + engineer.overtime
		    + "\n------------------");
	if (employee instanceof SalesPerson salesPerson)
	    System.out.println("------------------\nRole : " + salesPerson.role + "\nName : " + salesPerson.name
		    + "\nAddress : " + salesPerson.address + "\nAge : " + salesPerson.age + "\nGender :  "
		    + salesPerson.gender + "\nBasic salary : " + salesPerson.basicSalary + "\nCommission : "
		    + salesPerson.commission + "\n------------------");
    }

    // ---------------------------- M a i n -------------------------------------

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
	LinkedList<Employee> employeeList = new LinkedList<Employee>();
	
	
	{
	    employeeList.add(new Manager("Rohan", "Mumbai", "Male", 12000, 23, 4));
	    employeeList.add(new Engineer("Aryan", "Pune", "Male", 15000, 22, 3));
	    employeeList.add(new SalesPerson("Tushar", "Mumbai", "Male", 22000, 26, 2));
	    employeeList.add(new Manager("Karan", "Mumbai", "Male", 25000, 25, 2));
	    employeeList.add(new SalesPerson("Raju", "Delhi", "Male", 22000, 26, 4));
	    employeeList.add(new Manager("Priti", "Pune", "Female", 52000, 23, 5));
	}
	String result;

	do
	{
	    result = Employee.menuDisplay(employeeList);
	    switch (result)
	    {
	    case "exit" -> System.out.println("exited...");
	    default -> System.out.println(employeeList.size()+" employees loaded...");
	    }
	} while (!result.equals("exit"));

    }

}
