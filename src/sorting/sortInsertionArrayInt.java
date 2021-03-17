/* Insertion Sort program for sorting integer array */
/* Works like arranging a deck of cards in hand. We select a card and place it at it's right place in deck. */
package sorting;

public class sortInsertionArrayInt {

	public static void InsertionSort(int[] a)
	{
		int temp=0;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];						//selecting the card
			int j=i;
			while(j>0 && a[j-1]>temp)		//placing at it's right position
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
	}
	public static void main(String[] args) {
		int [] a  = {4,3,2,10,12,1,5,6};
		InsertionSort(a);
		for(int i:a) System.out.print(i+" ");
	}

}
