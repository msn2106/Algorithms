/* Selection Sort program to sort a string array in lexicographical order */
package sorting;

public class sortSelectionArrayString {

	public static void main(String[] args) {
		String[] a = {"mayank","dhiraj","ashish","akash","paras","prince"};
		int min;
		String temp="";
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)		//selecting the index of smallest in remaining array
			{
				if(a[j].compareTo(a[min])<0) min=j;
			}
			temp=a[i];						//swapping the element of smallest index in remaining array with element at index i
			a[i]=a[min];
			a[min]=temp;
		}
		for(String i : a)					//printing sorted array
		{
			System.out.print(i+" ");
		}

	}

}
