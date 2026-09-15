package Arrays;

public class sumOfArray3
{
//    3. Modify the exercise 2 and Write a Java program to sum values of an array
    
    public static void main(String[] args)
    {
	System.out.println("enter the size of array");
	int size=ConsoleInput.getInt();
	int arr[]= new int[size];
	System.out.println("enter the values one by one");
	int sum=0;
	for (int i : arr)
	{
	    sum+=i;
	}
	System.out.println("the sum of array is "+sum);

    }

}
