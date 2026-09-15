package Arrays;

public class maxMin6
{
//    6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.

    public static void main(String[] args)
    {
	int arr[] = { 1, 2, 3, 4, 5, 6 };
	int maxElement = arr[1], minElement = arr[1];
	for (int i = 0; i < arr.length; i++)
	{
	    if (arr[i] > maxElement)
		maxElement = arr[i];
	    if (arr[i] < minElement)
		minElement = arr[i];
	}

	System.out.println("the maximum value in the array is : "+maxElement+"\nthe minimum value in the array is : "+minElement);
    }

}
