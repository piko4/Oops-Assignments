package classes;

//1. Create a class named 'Student' with String variable 'name' , integer variable
//'roll_no'., String variable ‘phone_no’ and String variable ‘address’
//	a. Assign the value of roll_no as '2' and that of name as "John" by creating an
//	object of the class Student.

//	b. Assign and print the roll number, phone number and address of two students
//	having names "Sam" and "John" respectively by creating two objects of class
//	'Student'.

public class Student
{
    String name;
    int roll_no;
    String phone_no, address;

    public Student(String name, int roll_no)
    {
	this.roll_no = roll_no;
	this.name = name;
    }

    public Student(String name, int roll_no, String phone_no, String address)
    {
	this.roll_no = roll_no;
	this.name = name;
	this.address = address;
	this.phone_no = phone_no;
    }

    public static void main(String[] args)
    {
	Student student1 = new Student("john", 2);
	Student student2 = new Student("john", 3, "90348212", "mumbai");
	Student student3 = new Student("sam", 4, "90348112", "delhi");
	
	System.out.println(student1.name+"\n"+student1.roll_no+"\n"+student1.phone_no+"\n"+student1.address);
	System.out.println("----------------------");
	System.out.println(student2.name+"\n"+student2.roll_no+"\n"+student2.phone_no+"\n"+student2.address);
	System.out.println("----------------------");
	System.out.println(student3.name+"\n"+student3.roll_no+"\n"+student3.phone_no+"\n"+student3.address);
    }

}
