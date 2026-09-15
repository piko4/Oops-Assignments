package Arrays;

public class copyArray5
{
//    5.Modify exercise 2 Write a Java program to copy an array by iterating the array
    
    public static void main(String[] args)
    {
	System.out.println("Enter the size of array");
	int size=ConsoleInput.getInt();
	int arr1[]=new int[size];
	int arr2[]=new int[size];
	
	System.out.println("Enter values one by one");
	for(int i=0;i<size;i++)
	    arr1[i]=ConsoleInput.getInt();
	
	System.out.println("After copying");
	for(int i=0;i<size;i++)
	    arr2[i]=arr1[i];
	
	for (int i : arr2)
	{
	    System.out.println(i);
	}
    }

}
