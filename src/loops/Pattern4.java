package loops;

import java.util.Iterator;

public class Pattern4
{
//    4. Using For loops write a program to display the following
//    pattern
//    *
//    **
//    ***
//    ****
//    *****
    public static void main()
    {
	for (int i = 0; i < 5; i++)
	{
	    for (int j = 0; j <=i; j++)
	    {
		
		System.out.print("*");
	    }
	    System.out.println();
	}
    }
}
