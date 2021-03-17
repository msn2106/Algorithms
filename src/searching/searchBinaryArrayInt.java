/* Binary Search works only on sorted array. */
package searching;

public class searchBinaryArrayInt {

	public static void main(String[] args) {

		int [] arr = { 2,5,9,13,14,19,24,28,37,42,56,88,94};
		
		int item = 19;
		int lowerIndex = 0;
		int higherIndex = arr.length -1;
		int middleIndex = (lowerIndex+higherIndex)/2;
		
		while(lowerIndex <= higherIndex)
		{
			if(arr[middleIndex]==item)
			{
				System.out.println(item+" is at index "+middleIndex+" in the array.");
				break;
			}
			else if(arr[middleIndex]<item) lowerIndex = middleIndex + 1;
			else higherIndex = middleIndex -1;
			middleIndex = (lowerIndex+higherIndex)/2;
		}
		if(middleIndex > higherIndex) System.out.println("element not found");

	}

}
