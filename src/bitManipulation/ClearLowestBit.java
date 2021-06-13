package bitManipulation;

import java.util.Scanner;

public class ClearLowestBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 63;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));

        //1. will clear the lowest set bit
        int clear = n & n-1;
        System.out.println(clear);
        System.out.println(Integer.toBinaryString(clear));

        sc.close();
    }
}
