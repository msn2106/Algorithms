package bitManipulation;

import java.util.Scanner;

public class BitOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            //using Bitwise & for finding even or odd
            int n = sc.nextInt();
            if((n & 1) == 0) System.out.println("Even");
            else System.out.println("Odd");

            //using Bitwise XOR for swapping two numbers
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+","+b);
            a = a^b;
            b = a^b;
            a = a^b;
            System.out.println(a+","+b);
        }
    }
}
