package mergedSort;

public class MergedMain {

	static int [] numbers = {31,1,67,4,50,12};
	
	public static void main(String[] args) 
	{
		
		MergedMain m1 = new MergedMain();
		int left = 0;
		int right = numbers.length-1;
		
		m1.sort(numbers, left,right );
		print();
		
	}
	
	void sort(int[] arr,int left,int right) 
	{
		if(left < right) 
		{
			int mid = (left + (right - left)/2);
			
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
		
	}

	 void merge(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		
		 int leftsize=mid-left+1;
		 int rightsize=right-mid;
		 
		 int[]leftarr=new int[leftsize];
		 int[]rightarr=new int[rightsize];
		 
		 for(int leftctr=0;leftctr<leftsize;++leftctr)
		 {
			 leftarr[leftctr]=numbers[left+leftctr];
		 }
		 
		 for(int rightctr=0;rightctr<rightsize;++rightctr)
		 {
			 rightarr[rightctr]=numbers[mid+1+rightctr];
		 }
		 
		 int leftctr=0;
		 int rightctr=0;
		 int mergectr=left;
	
		 while(leftctr<leftsize && rightctr<rightsize)
		 {
			 if(leftarr[leftctr]<=rightarr[rightctr])
			 {
				 numbers[mergectr]=leftarr[leftctr];
				 leftctr++;
			 }
			 else
			 {
				 numbers[mergectr]=rightarr[rightctr];
				 rightctr++;
			 }
			 
			 mergectr++;
		 }
		 
		 while(leftctr<leftsize)
		 {
			 numbers[mergectr]=leftarr[leftctr];
			 leftctr++;
		 }
		 
		 while(rightctr<rightsize)
		 {
			 numbers[mergectr]=rightarr[rightctr];
			 rightctr++;
		 }
		 
	}
	 
	 static void print()
	 {
		 for(int i=0;i<numbers.length;i++)
		 {
			 System.out.println(numbers[i]+" ");
		 }
	 }

}
