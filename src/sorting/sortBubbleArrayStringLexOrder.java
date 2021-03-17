/* Bubble sort program to sort given string array in lexicographical order */
/* The Java String compareTo() method is used for comparing two strings lexicographically. 
 * Each character of both the strings is converted into a Unicode value for comparison. 
 * If both the strings are equal then this method returns 0 else it returns positive or negative value. 
 * The result is positive if the first string is lexicographically greater than the second string 
 * else the result would be negative.
 */
package sorting;

public class sortBubbleArrayStringLexOrder {

	public static void main(String[] args) {
		String a[]= {"mayank","dhiraj","ashish","akash","paras","prince"};
		String temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) break;
		}
		System.out.print("Lex Sorted array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}

}
