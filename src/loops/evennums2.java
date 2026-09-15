package loops;

public class evennums2
{
//    2. using for loops write a Java Program to display all even
//    numbers from 1 to 500.
    public static void main(String[] args)
    {
	System.out.println("Even numbers from 1 to 500");
	for (var i = 1; i != 500; i++)
	{
	    if(i%2==0)
		System.out.print(" "+i);
	}

    }

}
