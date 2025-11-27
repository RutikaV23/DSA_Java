package heapSort;

public class HeapSort {

	int numbers[] = {23,12,1,66,3,21}; 
	
	public static void main(String[] args)
	{
		HeapSort app=new HeapSort();
		app.sort(app.numbers);
		app.print();
	}
	
	public void print()
	{
		for(int ctr=0;ctr<numbers.length;ctr++)
		{
			System.out.print(numbers[ctr] + " ");
		}
		System.out.println();
	}
	
	public void sort(int[] ref)
	{
        int length = ref.length;

        // Build heap (rearrange array)
        for (int ctr = length / 2 - 1; ctr >= 0; ctr--) {
            heapify(ref, length, ctr);
        }

        // One by one extract an element from heap
        for (int ctr = length - 1; ctr > 0; ctr--) {

            // Move current root to end
            int temp = ref[0]; 
            ref[0] = ref[ctr];
            ref[ctr] = temp;

            // Call max heapify on the reduced heap
            heapify(ref, ctr, 0);
        }
	}
	
	public void heapify(int[] ref,int length, int start) 
	{
    // Initialize largest as root
    int largest = start; 

    // left index = 2*i + 1
    int left = 2 * start + 1; 

    // right index = 2*i + 2
    int right = 2 * start + 2;

    // If left child is larger than root
    if (left < length && ref[left] > ref[largest]) {
        largest = left;
    }

    // If right child is larger than largest so far
    if (right < length && ref[right] > ref[largest]) {
        largest = right;
    }

    // If largest is not root
    if (largest != start) {
        int temp = ref[start];
        ref[start] = ref[largest];
        ref[largest] = temp;

        // Recursively heapify the affected sub-tree
        heapify(ref, length, largest);
    }
	}

}

