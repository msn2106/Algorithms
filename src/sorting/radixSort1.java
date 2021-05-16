package sorting;

/**
 * The idea of Radix Sort is to do digit by digit sort starting from least significant digit
 * to most significant digit. Radix sort uses counting sort(or any other stable sorting algo)
 * as a subroutine to sort.
 *
 * Time Complexity - O(d*(n+b)) where d is the no. of digits in the maximum number and
 * n is size of array and
 * b is the base for the representing number like 10 for decimal.
 *
 * Note :- If we have log2n bits for every digit, the running time of Radix appears to be better
 * than Quick Sort for a wide range of input numbers. The constant factors hidden in asymptotic
 * notation are higher for Radix Sort and Quick-Sort uses hardware caches more effectively.
 * Also, Radix sort uses counting sort as a subroutine and counting sort takes extra space
 * to sort numbers.
 */

public class radixSort1 {
    public static void main(String[] args) {
        int[] arr = {432,-8,530,90,88,-231,11,45,677,199};
        radixSort(arr);
        System.out.println("Sorted array:");
        for(int i:arr) System.out.print(i+" ");
    }

    //main radix sort function - inside counting sort is get called for length of maximum number size
    static void radixSort(int[] arr){
        int max = getMax(arr,arr.length);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        if(min < 0){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] - min;
            }
        }
        for(int i = 1; (max/i) > 0 ; i *= 10)
        {
            countingSort(arr,arr.length,i);
        }
        if(min < 0){
            for (int i = 0; i < arr.length; i++) {
                arr[i] += min;
            }
        }
    }

    //subroutine stable sorting function-here counting sort
    private static void countingSort(int[] arr, int length, int i) {
        int[] count = new int[10];
        for(int j = 0;j < length; j++){
            ++count[(arr[j]/i)%10];
        }
        for (int j = 1; j < 10; j++) {
            count[j] += count[j-1];
        }
        int[] res = new int[length];
        for(int j = length-1;j>=0;j--){
            res[--count[(arr[j]/i)%10]] = arr[j];
        }
        for (int j = 0; j < length; j++) {
            arr[j] = res[j];
        }
    }

    //function for finding maximum number in array
    private static int getMax(int[] arr, int length) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)max = arr[i];
        }
        return max;
    }
}
