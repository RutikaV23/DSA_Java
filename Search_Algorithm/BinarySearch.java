package searchAlgorithm;

public class BinarySearch {

	static int[]  numbers = {2,4,6,8,10,11};

	public static void main(String[] args) 
	{
		int result = binarySearch(numbers,8);
		
		if(result != -1) 
		{
			System.out.println("Element found at index " + result);
		}
		else 
		{
			System.out.println("Element not found  " );

		}
	}

	static int binarySearch(int [] array , int target) //return index 
	{
		int left = 0;
		int right = numbers.length -1;
		
		while(left <= right) 
		{
			int mid = left + right;
			
			if( target == numbers[mid]) 
			{
				return mid;
			}
			else 
				if(target < numbers[mid]) 
				{
					right = mid -1;
				}
			else 
			{
				left = mid +1;
			}
		}
		
		return -1;
	}
}
