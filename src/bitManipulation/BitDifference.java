package bitManipulation;

import java.util.Scanner;

class Solution{
    public static int countBitsFlip(int a, int b){
        int n = a^b;
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
        }
        return count;
    }
}

public class BitDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m,n;
        long ans = 0;
        while (t-- >0){
            m = sc.nextInt();
            n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.countBitsFlip(m,n));
        }
    }
}
/* Question:-
You are given two numbers A and B.
The task is to count the number of bits needed to be flipped to convert A to B.
 */

/* tc:-
2
10 20
34 7
 */
/*tc sol:-
4
3
 */