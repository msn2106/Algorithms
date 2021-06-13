package bitManipulation;

import java.util.Scanner;

public class BitMasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int bit = sc.nextInt();
            System.out.println(Integer.toBinaryString(n));

            //finding the ith bit
            int res = getithbit(n,bit);
            System.out.println(res);

            //setting bit - if 0 make 1,else nothing
            int set = setithbit(n,bit);
            System.out.println(set);
            System.out.println(Integer.toBinaryString(set));

            //clearing the ith bit - if 1 make 0 else nothing
            int clear = clearithbit(n,bit);
            System.out.println(clear);
            System.out.println(Integer.toBinaryString(clear));

        }
    }

    public static int getithbit(int n, int bit){
        int mask = 1<<bit;
        int res = n & mask;
        if(res == 0) return 0;
        else return 1;
    }

    public static int setithbit(int n, int bit){
        int mask = 1<<bit;
        int res = n | mask;
        return res;
    }

    public static int clearithbit(int n, int bit){
        int mask = 1<<bit;
        int negMask = ~mask;
        int res = n & negMask;
        return res;
    }
}
