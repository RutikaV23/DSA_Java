package Insertion;

import java.util.Scanner;

public class InsertionsortMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		int size;
		System.out.println("Enter the size of array: ");
		size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter " + size + " elements : ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print("arr[" + i + "] = ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\nArray Elements are Before Sorting: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print("\t" + arr[i]);
		}
		
		insertionsort(arr);
		
		System.out.print("\nArray Elements are after Sorting: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print("\t" + arr[i]);
		}
		
	}
	
	public static void insertionsort(int[] arr) 
	{

		for (int i = 1; i < arr.length; i++) 
        {
            int compareValue = arr[i]; // element to compare
            int j = i - 1;

            // Shift elements greater than compareValue to the right
            while (j >= 0 && arr[j] > compareValue) 
            {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the element at correct position
            arr[j + 1] = compareValue;
        }
	}
}
