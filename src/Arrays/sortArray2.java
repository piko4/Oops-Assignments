package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class sortArray2
{
//    2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, aer
//    he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.

    public static void main(String[] args)
    {
	System.out.println("Enter the size of an array");
	int size = ConsoleInput.getInt();

	int arr[] = new int[size];
	System.out.println("Enter the elements in the array ");

	for (int i = 0; i < size; i++)
	{
	    arr[i] = ConsoleInput.getInt();
	}

	int count = 0;
	boolean swapped = true;
	while (swapped)
	{
	    swapped = false;
	    int i = 0, j = 1, temp;
	    for (int index = 0; index <= arr.length; index++)
	    {
		if (j == arr.length || i == arr.length)
		    break;
		if (arr[j] < arr[i])
		{
		    temp = arr[j];
		    arr[j] = arr[i];
		    arr[i] = temp;
		    swapped = true;
		}
		i++;
		j++;
	    }
	    count++;
	}
	System.out.println("Took " + count + " passes to sort the array");
	for (int k : arr)
	{
	    System.out.print(" " + k);
	}

    }

}
