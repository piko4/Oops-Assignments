package classes;

//    3. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//    respectively by creating a class named 'Rectangle' with a method named 'area'
//    which returns the area and length and breadth passed as parameters to its
//    constructor.

public class Rectangle
{
    double sideA, sideB;

    public Rectangle(double i, double j)
    {
	sideA = i;
	sideB = j;
    }

    
    public double[] Area(){
	return new double []{sideA*sideB,sideA,sideB};
    }

    public static void main()
    {
	Rectangle rectangle1 = new Rectangle(4, 5);
	Rectangle rectangle2 = new Rectangle(5, 8);
	System.out.println("area of rectangle1 having length : "+rectangle1.Area()[1]+" and breadth "+rectangle1.Area()[2]+" is :"+rectangle1.Area()[0]);
    }
}
