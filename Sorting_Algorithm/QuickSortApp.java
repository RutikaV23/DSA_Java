package quickSort;

public class QuickSortApp 
{
	
	int [] numbers = {23,6,25,3,99,10};
	
	
	public static void main(String []args) 
	{
			
		QuickSortApp app = new QuickSortApp ();	
		app.QuickSort(app.numbers);
		app.print();
	}

	void QuickSort (int[] ref) 
	{
		sort(ref,0,ref.length-1);
	}
	
	private void sort(int[] ref, int low, int high) 
	{
		if(low<high) 
		{
			int divisionpos = divide(ref,low,high) ;
			sort(ref,low,divisionpos-1);
			sort(ref,divisionpos+1,high);
		}
	
	}
	
	public int divide(int[] ref,int low ,int high) 
	{
		int pivot = ref[high];
		int first = low-1;
		
		for(int second = low;second < high ; second++)
		{
			if(ref[second] <= pivot) 
			{
				first++;
				int temp = ref[first];
				ref[first] = ref[second];
				ref[second] = temp;
			}
		}
		
		int temp = ref[first+1];
		ref[first+1] = ref[high];
		ref[high] = temp;
		return high;	
	}
	
	private void print() 
	{
		for(int ctr= 0;ctr<numbers.length;ctr++) 
		{
			System.out.println(numbers[ctr]+" ");
		}
		System.out.println();
	}
	
}
