package bitManipulation;

import java.util.Scanner;

public class BitMultiplicationDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mod = (int)Math.pow(10,9)+7;
        while (t-- >0){
            int a = sc.nextInt();
            int times = sc.nextInt();
            long res = a;

            //multiplication by 2
//            long startTime1 = System.nanoTime();
//            for (int i = 0; i < times; i++) {
//                res = (res%mod)*2;
//            }
//            System.out.println(res%mod);
//            long endTime1 = System.nanoTime();
//            System.out.println("Time:"+(endTime1-startTime1));
//
//            res = a;
//
//            long startTime2 = System.nanoTime();
//            for (int i = 0; i < times; i++) {
//                res = (res%mod) << 1;
//            }
//            System.out.println(res%mod);
//            long endTime2 = System.nanoTime();
//            System.out.println("Time:"+(endTime2-startTime2));


            //division by 2
            long startTime3 = System.nanoTime();
            for (int i = 0; i < times; i++) {
                res = res/2;
            }
            System.out.println(res);
            long endTime3 = System.nanoTime();
            System.out.println("Time:"+(endTime3-startTime3));

            res = a;

            long startTime4 = System.nanoTime();
            for (int i = 0; i < times; i++) {
                res = (res) >> 1;
            }
            System.out.println(res);
            long endTime4 = System.nanoTime();
            System.out.println("Time:"+(endTime4-startTime4));
        }
        sc.close();
    }
}

// Bitwise Right Shift - divides by 2
//Bitwise Left Shift - multiplies by 2
// These are way faster than division and multiplication when performed in loops