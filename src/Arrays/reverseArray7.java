package Arrays;

public class reverseArray7
{
//    7.Modify exercise 2 Write a Java program to reverse an array of integer values

    public static void main(String[] args)
    {
	int arr[] = { 1, 2, 3, 4, 5 };
	int arrRev[] = new int[arr.length];
	int i=0,j=arr.length-1;
	while (i !=arr.length)
	{
	    arrRev[i]=arr[j];
	    i++;
	    j--;
	}
	System.out.println("the reversed array is ");
	for (int k : arrRev)
	{
	    System.out.print(k);
	}
    }

}
