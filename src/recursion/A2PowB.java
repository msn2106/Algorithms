/* Program to solve a raise to power b using recursion */
package recursion;

import java.util.Scanner;
public class A2PowB {
	
	static int stepCount = 0;
		
    //function using recursion
    public static Integer pow(int a, int b){
    	stepCount++;
        if(a==0) return 0;
        else if(a>0 && b==0) return 1;
        else if(a==1) return 1;
        else{
            return a*pow(a,b-1);
        }
    }

    //faster approach for same
    public static int fastpow(int a, int b) {
    	stepCount++;
    	if(b==0) return 1;
    	if(b%2 == 0) return fastpow(a*a,b/2); //for even
    	return a*fastpow(a, b-1);	//for odd
    }
    
    //main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
            System.out.println(pow(3,500));
            System.out.println("Steps:"+ stepCount);
            System.out.println();
            stepCount = 0;
            System.out.println(fastpow(3,500));
            System.out.println("Steps:"+ stepCount);
            System.out.println("Just these many steps! OMG !!");
        sc.close();
    }
}