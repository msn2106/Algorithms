/* Bubble Sort program to sort integer array */
//Bubble sort swaps to adjacent elements
package sorting;
import java.util.Scanner;
public class sortBubbleArrayInt {
	public static void BubbleSort(int [] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) //for not checking the end sorted part of array
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) break;	//if array gets sorted before reaching to array.length
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = {36,19,29,12,5};
		BubbleSort(a);
		
		System.out.print("Sorted array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		sc.close();
	}
/* In bubble sort, we compare each pair of adjacent element and swap them if they 
 * in wrong order.
 * Time Complexity - O(n^2)*/
	
}
