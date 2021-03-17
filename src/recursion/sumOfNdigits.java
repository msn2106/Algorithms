/*Program to find sum of consecutive N whole number using recursion*/
package recursion;

import java.util.Scanner;
public class sumOfNdigits {
    //function using recursion
    public static Integer SumOfN(int N){
        if(N==0) return 0;
        else if(N==1) return 1;
        else{
            return N+SumOfN(N-1);
        }
    }

    //main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            int N = sc.nextInt();
            System.out.println(SumOfN(N));
        }
        sc.close();
    }
}
/*3 steps:-
 * 1.) Base Case [Like here, f(0)=0 and f(1)=1]
 * 2.) Find the relation [Like here, f(n) = f(n-1)+n example:- f(7) = f(6)+7]
 * 3.) Generalize {Make a generalized function or a tree}
 * [Like return N+f(N-1) or n*f(n-1) or {f(n-1)*2}%n anything like this]
 * */