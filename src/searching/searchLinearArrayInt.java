/* Linear Search implementation using integer array */
package searching;

import java.util.Scanner;

public class searchLinearArrayInt {

	/*
	public static void main(String[] args) {
		int [] arr = {2,13,4,11,15,17,78,45,67,23};
		int item = 17;
		int temp=0;
		for(int i =0 ;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				System.out.print(item+" present in array at index "+i);
				temp = temp+1;
			}
		}
		if(temp==0) System.out.println("item not present in the array.");
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the element to be searched in the array:");
		int item = sc.nextInt();
		int temp=0;
		for(int i =0 ;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				System.out.print(item+" present in array at index "+i);
				temp = temp+1;
			}
		}
		if(temp==0) System.out.println("item not present in the array.");
		sc.close();
	}
}
