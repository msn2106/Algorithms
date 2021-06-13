package bitManipulation;

import java.util.Scanner;

/**
 * Adding number without using arithmetic operator - using
 * bitwise operator
 */

public class BitwiseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(sum(a,b));
            System.out.println(addOne(a));
        }
    }

    public static int sum(int x, int y){
        // Iterate till there is no carry
        while (y != 0)
        {
            // carry now contains common
            // set bits of x and y
            int carry = x & y;

            // Sum of bits of x and
            // y where at least one
            // of the bits is not set
            x = x ^ y;

            // Carry is shifted by
            // one so that adding it
            // to x gives the required sum
            y = carry << 1;
        }
        return x;
    }

    //recursive function for addition.
    static int Add(int x, int y)
    {
        if (y == 0)
            return x;
        else
            return Add(x ^ y, (x & y) << 1);
    }

    //adding 1 to the number
    static int addOne(int x){
        int m = 1;
        // Flip all the set bits until we find a 0
        while( (int)(x & m) != 0){
            x = x ^ m;
            m <<= 1;
        }
        // flip the rightmost 0 bit
        x = x ^ m;
        return x;
    }
}
//copied from GFG
//Example
/**
 *
 *
 *
 *
 */