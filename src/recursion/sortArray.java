/*Program to sort array using recursion*/
package recursion;

public class sortArray {
	private static int stepCount = 0;
	
	//recursive bubble sort for int array
	public static void rsort(int[] n,int s) {
		if(s==0) return;
		if(s==1) return;	//base condition
		for(int i=0;i<s-1;i++) {	//relation
			stepCount++;
			if(n[i]>n[i+1]) {
				int temp = n[i];
				n[i] = n[i+1];
				n[i+1] = temp;
			}
		}
		rsort(n,s-1);	//induction or generalization
	}

	//main function
	public static void main(String[] args) {
		int a [] = {36,19,5,42,21,54,20};
		int s = a.length;
		
		System.out.println("Recursive Approach");
		rsort(a,s);
		System.out.print("Sorted array:");
		for(int i = 0; i<s;i++)System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("Steps:"+stepCount);
		
		System.out.println();
		System.out.println("Iterative Approach");
		stepCount = 0;
		BubbleSort(a);
		System.out.print("Sorted array:");
		for(int i = 0; i<s;i++)System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("Steps:"+stepCount);
		
	}
	
	//iterative bubble sort for int array
	public static void BubbleSort(int [] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) //for not checking the end sorted part of array
			{
				stepCount++;
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

}
