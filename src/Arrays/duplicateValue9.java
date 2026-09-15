package Arrays;

public class duplicateValue9
{
//    9. Modify exercise 2 Write a Java program to find the duplicate values of an array
    public static void main(String[] args)
    {
	Object arr[] = { 2, 2, 'e', 'e', 's', "hello", "hi" };

	int duplicate = 0;
	for (int i = 0; i < arr.length; i++)
	{
	    if (i == arr.length - 1)
		break;
	    if (arr[i] == arr[i + 1])
	    {
		duplicate++;
	    }
	}
	System.out.println("there are "+duplicate+" duplicate values in this array");
    }

}
