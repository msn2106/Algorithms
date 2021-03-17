/* Program to find all path by traveling right or bottom only in a grid*/
package recursion;

public class allPathNxMgrid {
	//function to find total number of paths
	static int path(int n,int m) {
		if(n==1 || m==1) return 1;
		return path(n, m-1)+ path(m, n-1);
	}
	
	//main function
	public static void main(String[] args) {
		System.out.println(path(4, 4));
		System.out.println(path(2, 2));
		System.out.println(path(200, 1));
		System.out.println(path(1, 100));
	}
}
/* here if we have a matrix of n x m size and we have to travel from
 * the top of the matrix to the bottom of the matrix by either traveling 
 * right or towards bottom, then method "path" will give the number of 
 * possible paths.
 */
