package bitManipulation;

import java.util.*;

/**
 * Question :-
 * Given an array A containing 2*N+2 positive numbers,
 * out of which 2*N numbers exist in pairs whereas
 * the other two number occur exactly once and are distinct.
 * Find the other two numbers.
 */
public class TwoOddOccuringInEvenOccuringArray {
    public static int[] singleNumber(int[] nums)
    {
        // code 1- using Hashset
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else set.add(nums[i]);
        }

        int res[] = new int[2];
        Iterator<Integer> it = set.iterator();
        int i=0;
        while(it.hasNext()){
            res[i] = (it.next());
            i++;
        }
        Arrays.sort(res);
        return res;

        // solution 2 -using bit manipulation
        // int xor = 0;
        // int setBit = 0;
        // for(int i=0;i<nums.length;i++){
        //     xor = xor ^ nums[i];
        // }
        // setBit = xor & (~(xor-1));
        // int x = 0;
        // int y = 0;
        // for(int i=0;i<nums.length;i++){
        //     if((nums[i] & setBit) != 0){
        //         x = x ^ nums[i];
        //     }
        //     else y = y ^ nums[i];
        // }
        // int res[] = new int[2];
        // res[0] = x;
        // res[1] = y;
        // Arrays.sort(res);
        // return (res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,7,9,8,7,9,8,3,3,2,5,7,5,2};
        int[] res = singleNumber(arr);
        for (int i : res) System.out.print(i + " ");
        System.out.println();
    }
}
/*
Test Case:-
1) {1,2,3,2,1,4} -> 3,4
2) {2,1,3,2} -> 1,3
3) {1,7,9,8,7,9,8,3,3,2,5,7,5,2} -> 1,7
 */