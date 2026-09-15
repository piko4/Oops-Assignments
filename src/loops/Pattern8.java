package loops;

public class Pattern8
{
//    8. Using for loops write a program to display the following
//    pattern
//    1 2 3 4 5 6
//    1 2 3 4 5
//    1 2 3 4
//    1 2 3
//    1 2
//    1
    public static void main(String[] args)
    {
	for (int i = 0; i <= 6; i++)
	{
	    int count=1;
	    for (int j = 6; j > i; j--)
	    {

		System.out.print(count+" ");
		count++;
	    }
	    System.out.println();
	}

    }

}
