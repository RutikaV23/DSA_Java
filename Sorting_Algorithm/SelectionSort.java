package SelectionSort;

import java.util.Scanner;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements : ");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nArray Before Sorting: ");
        for (int num : arr) 
        {
            System.out.print("\t" + num);
        }

        selectionsort(arr);

        System.out.print("\nArray After Sorting: ");
        for (int num : arr) 
        {
            System.out.print("\t" + num);
        }

        sc.close();
    }

    public static void selectionsort(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            // Find the index of minimum element
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            // Swap only once per iteration
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
