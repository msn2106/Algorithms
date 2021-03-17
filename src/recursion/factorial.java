/*recursive approach for calculating factorial.*/
package recursion;

public class factorial {
	
	//recursive function
	public static Integer fact(int num) {
		if(num <= 0) return 0;
		else if(num ==1) return 1;
		else return num*fact(num-1);
	}
	
	//iterative function
	public static Integer facto(int num) {
		int prod = 1;
		if(num <= 0 ) return 0;
		else if(num == 1) return 1;
		else {
			while(num>1) {
				prod = prod * num;
				num--;
			}
		}
		return prod;
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(-1));
		System.out.println(fact(10));
		System.out.println(facto(6));
	}
}
