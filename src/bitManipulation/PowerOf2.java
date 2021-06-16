package bitManipulation;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            long n = sc.nextInt();
            System.out.println(isPowerofTwo(n));
        }
        sc.close();
    }

    public static boolean isPowerofTwo(long n){
        // Your code here
        return n != 0 && ((n & (n-1)) == 0);
    }
}
