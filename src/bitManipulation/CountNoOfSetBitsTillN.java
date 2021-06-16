package bitManipulation;

import java.util.Scanner;

public class CountNoOfSetBitsTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int totalSetBits = countSetBits(n);
            System.out.println(totalSetBits);
        }
        sc.close();
    }

    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        if(n == 0) return 0;
        int x = largest2raisetoxforn(n);
        int bitstill2x = x * (1<<(x-1));
        int msbfrom2xtoN = n - (1<<x) + 1;
        int rest = n - (1<<x);
        int ans = bitstill2x + msbfrom2xtoN + countSetBits(rest);
        return ans;
    }

    //function to find the largest power of 2 which is <= n
    public static int largest2raisetoxforn(int n){
        int x=0;
        while((1<<x) <= n){
            x++;
        }
        return x-1;
    }
}
/* There are other and better methods too */
/**
 * Explanation: N = 20
 * Three segments:-
 * 1) Bits below maximum power of 2 (say x). like for 20 is 16, for 44 is 32 ..
 * 0 -15 needs 4 bits to represent in binary
 * the bit at 0 index is always on and off on simultaneous position - total of 16/2 times = 8
 * bit at index 1 is off for 2 times and then on for two times and follow same patter = (2/4)*16 = 8
 * bit at index 2 is off for 4 times then on for 4 times = (4/8)*16 = 8
 * bit at index 3 is off for 8 times and on for 8 times = 8
 *
 * this gives = 8+8+8+8 = 32
 * which in formula is (maxPowerOf2LessThanN) * (2 raise to (maxPowerOf2LessThanN - 1)) = 4 * (2 ^ (4-1) ) = 4 * 8 = 32
 *
 * 2) from 16 to 20 the bit at index 3 is all 1 so
 * msbFrom2xToN = n - ( 2 raise to x) + 1 = 20 - (2^(4))+1 = 20-16+1 = 5 , here x is maxPowerOf2LessThanN (in example 4)
 *
 * 3) once the msbFrom2xToN is removed the series becomes smaller by a bit - that is it turns to three bit from for our example
 * the numbers left now represent the number from 0 to pending... in example 0 - rest
 * for rest = n - (2 raise to maxPowerOf2LessThanN) = 20 - 16 = 4 , so we have to count the number of bits from 0 -4 now.
 *
 * 4) we will make a recursive call to the function ...and we know the base case is 0 as for zero there are no set bits.
 *
 * we add all this and get the number of set bits from 0 to N.
 */

/**
 * Note :- 2 raise to x can be written as 1<<x and x divides by 2 can be written as x >> 1
 */