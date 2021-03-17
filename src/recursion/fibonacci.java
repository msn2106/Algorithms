/*Program to find the fibonacci series.*/
//Comparison b/w the recursive and iterative approach
package recursion;

public class fibonacci {
	private static int stepCount = 0;
	//function to calculate fibonacci by iterative approach
	public static int[] fibit(int[] arr) {
		int n = arr.length;
		arr[0] = 0; arr[1] = 1;
		for(int i= 2 ;i<n;i++) {
			stepCount++;
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr;
	}
	
	//function to calculate fibonacci series till the given number by recursive method
	public static int fib(int num) {
		stepCount++;
		if(num == 0) return 0;
		else if(num == 1) return 1;
		else return fib(num-1)+fib(num-2);
	}
	
	//main function
	public static void main(String[] args) {
		System.out.println("Fibonacci Series:Recursive Approach");
		for(int i = 0;i<10;i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println();
		System.out.println("Steps:"+stepCount);
		
		//Iterative Approach
		System.out.println();
		stepCount = 0;
		System.out.println("Fibonacci Series: Iterative Approach");
		int[] arr = new int[10];
		fibit(arr);
		for(int i:arr)System.out.print(i+" ");
		System.out.println();
		System.out.println("Steps:"+(stepCount+2));	//+2 for a[0] and a[1] manual assignment
	}
}
