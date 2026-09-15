package classes;

//2. Write a program to prdouble the area and perimeter of a triangle having sides of 3, 4
//and 5 units by creating a class named 'Triangle' with constructor having the three
//sides as its parameters.
public class Triangle
{
    double sideA, sideB, sideC;

    public Triangle(double A, double B, double C)
    {
	sideA = A;
	sideB = B;
	sideC = C;
    }

    public double Perimeter()
    {
	return this.sideA + this.sideB + this.sideC;
    }

    public double Area()
    {
	double semi_perimeter=(sideA+sideB+sideC)/2;
	
	
	return (double) Math.sqrt(semi_perimeter*(semi_perimeter-sideA)*(semi_perimeter-sideB)*(semi_perimeter-sideC));
    }

    public static void main(String[] args)
    {
	Triangle triangle = new Triangle(3, 4, 5);

	System.out.println("Perimeter of traingle is : "+triangle.Perimeter()+"\nArea of traingle is : "+triangle.Area());
    }

}
