package bitManipulation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Question - Given an array of positive integers.
 * All numbers occur an even number of times except
 * one number which occurs an odd number of times.
 * Find the number in O(n) time & constant space.
 */

public class NoOccuringOddNoOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        int res = oddNo(arr);
        System.out.println(res);
    }

    public static int oddNo(int[] arr){
        //solution 1 - HashSet - O(n) time but extra space
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i=0;i<arr.length;i++){
//            if(set.contains(arr[i])){
//                set.remove(arr[i]);
//            }
//            else set.add(arr[i]);
//        }
//        int res = 0;
//        for(int i:set)res = i;
//        return res;

        //solution 2 - Bit Manipulation - O(1) time and space
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
