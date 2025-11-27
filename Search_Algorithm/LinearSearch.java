package searchAlgorithm;

public class LinearSearch
{
//	String []color = {"Red" ,"Blue","Violet","Orange","Black"};
	static int[]  numbers = {2,4,6,8,10,1};
	
	public static void main(String[] args) 
	{
		int num = 6;
		for(int ele = 0;ele < numbers.length ;ele++ ) 
		{
			if(numbers[ele] == num) 
			{
				System.out.println(num + " Element is found at index " + ele );
				return;
			}
		}
		System.out.println(num + " Element is not found ");

		
	}

}
