package Arrays;

public class duplicateIntValue8
{
//    8.Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
    public static void main(String[] args)
    {
	int arr[] = { 1, 2, 2, 3, 4, 5, 5, 6 };
	int duplicate = 0;
	for (int i = 0; i < arr.length; i++)
	{
	    if (i == arr.length - 1)
		break;
	    if (arr[i] == arr[i + 1])
		duplicate++;
	}

	System.out.println("there are " + duplicate + " values in the array");
    }

}
