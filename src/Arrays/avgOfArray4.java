package Arrays;

public class avgOfArray4
{
//    4. Modify exercise 2 Write a Java program to calculate average value of an array elements

    public static void main(String[] args)
    {
	int arr[] = { 1, 2, 3, 4, 3, 2, 4 };
	float sum = 0;
	for (int i : arr)
	{
	    sum += i;
	}
	float avg = sum / arr.length;
	
	System.out.println("the average of array is "+avg);
    }

}
