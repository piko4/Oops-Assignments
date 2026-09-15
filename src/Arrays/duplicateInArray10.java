package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class duplicateInArray10
{
//    10. Modify exercise 2 to accept 2 different values in 2 different arrays and find the common elements
//    between two arrays
    public static void main(String[] args)
    {
	Object array1[] = { 1, 2, 'e', "hello", "piyush" };
	Object array2[] = { 1, 3, 1, 'w', "hello", "priti", 3 };

	ArrayList<Object> common = new ArrayList<>();
	for (int i = 0; i < array1.length; i++)
	{

	    for (int j = 0; j < array2.length; j++)
	    {
		if (array1[i] == array2[j])
		    common.add(array2[j]);
	    }
	}
	System.out.print("Common elements in both arrays are : ");
	for (var i : common)
	    System.out.print(i);

    }

}
