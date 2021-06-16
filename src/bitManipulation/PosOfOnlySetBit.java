package bitManipulation;

import java.util.Scanner;

public class PosOfOnlySetBit {
    static int findPosition(int N) {
        // code here

        if( N <= 0 || ((N&(N-1)) != 0)) return -1;

        int pos = 0;
        while(N > 0){
            N = N >> 1;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int totalSetBits = findPosition(n);
            System.out.println(totalSetBits);
        }
        sc.close();
    }
}
