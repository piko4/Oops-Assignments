package loops;

public class oddnums1
{
//    1. Using for loops write a Java Program to display all odd
//    numbers from 1 to 1000
    public static void main(String[] args)
    {
	System.out.println("Odd numbers from 1 to 1000");
	for (var i = 1; i != 1000; i++)
	{
	    if(!(i%2==0))
		System.out.print(" "+i);
	}
    }

}
