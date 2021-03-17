/* Selection Sort Program to sort integer array */
/* Selection sort first selects the smallest or the largest element and then swap that with the current index element */
package sorting;

public class sortSelectionArrayInt {
	public static void SelectionSort(int [] a)
	{
		int min,temp=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)		//selecting the index of smallest in remaining array
			{
				if(a[j]<a[min]) min=j;
			}
			temp=a[i];						//swapping the element of smallest index in remaining array with element at index i
			a[i]=a[min];
			a[min]=temp;
		}
	}
	public static void main(String[] args) {
		int[] a = {38,52,9,18,6,62,13};
		SelectionSort(a);
		for(int i : a)					//printing sorted array
		{
			System.out.print(i+" ");
		}

	}

}
