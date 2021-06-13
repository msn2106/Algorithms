package bitManipulation;

import java.util.Scanner;

public class CountSetBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        initialize();

        int a = sc.nextInt();

        System.out.println("No. of Bits Using Inbuilt function:"+ Integer.bitCount(a));
        System.out.println("No. of Bits Using Brian's Algo:"+ countSetBits(a));
        System.out.println("No. of Bits Using Brian's Algo Recursive:"+ countSetBitsR(a));
        System.out.println("No. of Bits Using LookUp Table:" + countSetBitsL(a));

    }

    //Using Brian Kernighan’s Algorithm for counting no. of set bits - O(logn)
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    //recursive Brian Kernighan’s Algorithm for counting no. of set bits - O(logn)
    public static int countSetBitsR(int n)
    {

        // base case
        if (n == 0)
            return 0;
        else
            return 1 + countSetBitsR(n & (n - 1));
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // Lookup table
    static int[] BitsSetTable256 = new int[256];

    // Function to initialise the lookup table
    public static void initialize()
    {

        // To initially generate the
        // table algorithmically
        BitsSetTable256[0] = 0;
        for (int i = 0; i < 256; i++) {
            BitsSetTable256[i] = (i & 1) + BitsSetTable256[i / 2];
        }
    }

    // Function to return the count of set bits in n - O(1) - but needs preprocessing
    public static int countSetBitsL(int n)
    {
        return (BitsSetTable256[n & 0xff]
                + BitsSetTable256[(n >> 8) & 0xff]
                + BitsSetTable256[(n >> 16) & 0xff]
                + BitsSetTable256[n >> 24]);
    }
}
