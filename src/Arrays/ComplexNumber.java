package Arrays;

/*	1. create a class called ComplexNumber having 2 data members as number1 and number2. Create a pair
	of getter and setter for the above. Create a method called computeComplexNumber that will mul&ply
	the values of the 2 data members and return it in the form of int. For the above create an array of
	ComplexNumber having 5 elements and in a loop ask the user to enter number1 and number2 5 &mes
	each such that each object of the ComplexNumber hold appropriate values. Finally call the
	computeComplexNumber on each object of the array to display the result
*/
public class ComplexNumber
{
    int number1, number2;

    public int getNumber1()
    {
	return number1;
    }

    public void setNumber1(int number1)
    {
	this.number1 = number1;
    }

    public int getNumber2()
    {
	return number2;
    }

    public void setNumber2(int number2)
    {
	this.number2 = number2;
    }

    public int computeComplexNumber()
    {
	return getNumber1()*getNumber2();
    }

}
