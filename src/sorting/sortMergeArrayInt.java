/* Merge Sort implementation - Time Complexity - O(nlogn). */
package sorting;

public class sortMergeArrayInt 
{
	int [] array;
	int [] temparr;
	int length;
	
	//main function
	public static void main(String[] args) {
		int arr[] = {48,36,13,52,19,94,21};
			
		System.out.println("Initial Array:");
		printArray(arr);
		System.out.println();
		sortMergeArrayInt sm = new sortMergeArrayInt();
		sm.mergeSort(arr);
		System.out.println("Sorted Array:");
		printArray(arr);
	}
	
	//mergeSort function - main function
	public void mergeSort(int [] arr)
	{
		this.array = arr;
		this.length = arr.length;
		this.temparr = new int[length];
		divideArray(0,length-1);
	}
			
	//function for recursively dividing the array
	public void divideArray(int lowerIndex , int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			divideArray(lowerIndex,middle);		//it will sort the left side of array
			divideArray(middle+1,higherIndex);	//it will sort the right side of array
			
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	
	//function for merging the singleton arrays together.
	public void mergeArray(int lowerIndex,int middle, int higherIndex)
	{
		for(int i = lowerIndex ; i <= higherIndex ; i++)
		{
			temparr[i]= array[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j<=higherIndex)
		{
			if(temparr[i]<= temparr[j])
			{
				array[k]= temparr[i];
				i++;
			}
			else
			{
				array[k]= temparr[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=temparr[i];
			k++;
			i++;
		}
	}	
	
	//function for printing array
	public static void printArray(int[] arr)
	{
		for(int i:arr) System.out.print(i+" ");
	}
}
