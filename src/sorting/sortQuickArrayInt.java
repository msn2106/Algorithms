/* Quick Sort implementation on integer array . */
package sorting;

public class sortQuickArrayInt {

	public static void main(String[] args) {
		int[] arr = {15,9,7,13,12,16,4,18,11};
		int len = arr.length;
		System.out.println("Initial Array:");
		printArray(arr);
		System.out.println();
		System.out.println("Array after sorting:");	
		sortQuickArrayInt sq = new sortQuickArrayInt();
		sq.quickSort(arr,0,len-1);
		printArray(arr);
	}
	
	public int partition(int [] arr,int low,int high)
	{
		int pivot = arr[(low+high)/2];
		while(low <= high)
		{
			while(arr[low]<pivot) low++;
			while(arr[high]>pivot) high--;
			if(low<=high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	public void quickSort(int[] arr,int low, int high)
	{
		int pi = partition(arr,low,high);
		if(low < pi-1) quickSort(arr,low,pi-1);
		if(pi < high) quickSort(arr,pi,high);
	}

	public static void printArray(int [] arr)
	{
		for(int i:arr) System.out.print(i+" ");
	}
}
