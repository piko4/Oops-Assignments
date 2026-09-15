package loops;

public class Pattern7
{
//    7. Using for loops write a program to display the following
//    pattern
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
//    1 2 3 4 5 6
    public static void main(String[] args)
    {

	for (int i = 1; i <= 6; i++)
	{
	    for (int j = 1; j <= i; j++)
	    {
		System.out.print(j+" ");
	    }
	    System.out.println();
	}

    }

}
