/* Binary Search works only on sorted array. */
package searching;

/**
 * Time Complexity - T(n) = T(n/2) + c - theta(logn)
 * Space - O(logn) - recursive(recursive call stack) , O(1) iterative
 */
public class searchBinaryArrayInt {

	public static void main(String[] args) {

		int [] arr = { 2,5,9,13,14,19,24,28,37,42,56,88,94};
		
		int item = 19;
		int index = binarySearch1(arr, 0, arr.length-1, item);
		if(index == 0) System.out.println(item+" is not present");
		else System.out.println(item+" is present at index "+ index);
	}

	//binarySearch - recursive
	public static int binarySearch(int[] a, int l, int r, int k){
		if( l <= r){
			int mid = l + (r-l)/2;
			if(a[mid] == k) return mid;
			if(a[mid] > k) return binarySearch(a,l,mid-1,k);
			return binarySearch(a,mid+1,r,k);
		}
		return -1;
	}

	//binarySearch - iterative
	public static int binarySearch1(int[] a, int l, int r, int k){
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (a[m] == k) return m;
			// If x greater, ignore left half
			if (a[m] < k)l = m + 1;
			// If x is smaller, ignore right half
			else r = m - 1;
		}
		return -1;
	}
}
