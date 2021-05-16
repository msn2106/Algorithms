/* Linear Search implementation using integer array */
package searching;

import java.util.ArrayList;
import java.util.Scanner;

public class searchLinearArrayInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++){
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the element to be searched in the array:");
		int item = sc.nextInt();
		int index = linearSearch2(arr, item);
		if(index != -1) System.out.println(item+" is present at index "+ index);
		else System.out.println(item+" is not present.");

		//multiple occurrences
//		int[] indexes = linearSearch3(arr,item);
//		System.out.println("Indexes where item is present");
//		for(int i: indexes) System.out.print(i+" ");
		sc.close();
	}

	//basic linear search - O(n) - worst case - return 1st occurrence
	public static int linearSearch1(int[] arr, int item){
		for(int i =0 ;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		}
		return -1;
	}

	//    if element Found at last  O(n) to O(1)
	//    if element Not found O(n) to O(n/2)
	public static int linearSearch2(int[] arr, int item){
		int lb = 0;
		int ub = arr.length-1;
		while(lb < ub){
			if(arr[lb] == item) return lb;
			if(arr[ub] == item) return ub;
			lb++;
			ub--;
		}
		return -1;
	}

	//multiple occurrences
	public static int[] linearSearch3(int[] arr, int item){
		ArrayList<Integer> ar = new ArrayList<>();
		int lb = 0;
		int ub = arr.length-1;
		while(lb < ub){
			if(arr[lb] == item){
				ar.add(lb);
			}
			if(arr[ub] == item){
				ar.add(ub);
			}
			lb++;
			ub--;
		}
		int[] res = new int[ar.size()];
		for (int i = 0; i < ar.size(); i++) {
			res[i] = ar.get(i);
		}
		return res;
	}
}
