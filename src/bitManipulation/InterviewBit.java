package bitManipulation;

public class InterviewBit {
    public static void main(String[] args) {
        int x = 54;
        int y = 63;
        System.out.println(x+"->"+Integer.toBinaryString(x));
        System.out.println(y+"->"+Integer.toBinaryString(y));

        //1. will clear the lowest bit
        int clearX = x & x-1;
        int clearY = y & y-1;
        System.out.println(clearX+","+clearY);
        System.out.println(Integer.toBinaryString(clearX));
        System.out.println(Integer.toBinaryString(clearY));


        //2. extract the lowest bit
        System.out.println("Lowest Bit in x:"+ (x & ~(x-1)));
        System.out.println("LSB of y:"+ (y & ~(y-1)));

    }
}

/** From Interview Bit - Bit Manipulation
 * x & (x-1) will clear the lowest set bit of x
 * x & ~(x-1) extracts the lowest set bit of x (all others are clear). Pretty patterns when applied to a linear sequence.
 * x & (x + (1 << n)) = x, with the run of set bits (possibly length 0) starting at bit n cleared.
 * x & ~(x + (1 << n)) = the run of set bits (possibly length 0) in x, starting at bit n.
 * x | (x + 1) = x with the lowest cleared bit set.
 * x | ~(x + 1) = extracts the lowest cleared bit of x (all others are set).
 * x | (x - (1 << n)) = x, with the run of cleared bits (possibly length 0) starting at bit n set.
 * x | ~(x - (1 << n)) = the lowest run of cleared bits (possibly length 0) in x, starting at bit n are the only clear bits.
 */


/**
 * 110111 -> n
 *  10000 -> 1<<4
 *1000111 -> n+(1<<4)
 * 110111
 *0000111 -> n&(n+(1<<4)) -> 7
 */