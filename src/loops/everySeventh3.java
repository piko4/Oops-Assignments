package loops;

public class everySeventh3
{
//    3. using for loops write a Java Program to display every 7th
//    number from 1 to 200
    public static void main(String[] args)
    {
	System.out.println("Every 7th number from 1 to 200");
	for (var i = 1; i != 100; i++)
	{
	    if (7 * i > 200)
		break;

	    System.out.print(" " + 7 * i);
	}

    }

}
