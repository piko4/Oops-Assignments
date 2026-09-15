package Arrays;

import java.lang.reflect.Array;

/*	1. create a class called ComplexNumber having 2 data members as number1 and number2. Create a pair
of getter and setter for the above. Create a method called computeComplexNumber that will mul&ply
the values of the 2 data members and return it in the form of int. For the above create an array of
ComplexNumber having 5 elements and in a loop ask the user to enter number1 and number2 5 &mes
each such that each object of the ComplexNumber hold appropriate values. Finally call the
computeComplexNumber on each object of the array to display the result
*/
public class main
{

    public static void main(String[] args)
    {
	ComplexNumber cn[] = new ComplexNumber[5];
	for (var i = 0; i < 5; i++)
	{
	    cn[i]=new ComplexNumber();
	    System.out.println("Enter the two numbers");
	    cn[i].setNumber1(ConsoleInput.getInt());
	    cn[i].setNumber2(ConsoleInput.getInt());

	}
	for (var i = 0; i < 5; i++)
	{
	    System.out.println(cn[i].computeComplexNumber());
	}
    }

}
