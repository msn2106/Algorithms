/* Problem - Josephus Problem. Here the numbers denotes the persons standing 
 * in circle, according to increasing order on the left till the last. If "n"
 * denotes number of persons and "k" denotes the person to be killed. Every 
 * time we go along the circle the kth person is killed in the way. 
 * Determine the last person standing.
 */
package recursion;

public class josephusProblem {
	
	//recursive function to calculate the last man standing
	public static int jos(int n, int k) {
		if(n==1) return 1;
		else return (jos(n-1,k)+k-1)%n + 1;
	}
	public static void main(String[] args) {
		System.out.println(jos(7, 3));
		System.out.println(jos(8, 2));
	}

}
