package sorting;

/**
 * Counting sort is a sorting technique based on keys between a specific range.
 * It works by counting the number of objects having distinct key values
 * (kind of hashing). Then doing some arithmetic to calculate the position of
 * each object in the output sequence.
 *
 * Time Complexity - O(n+k)
 * Auxiliary Space - O(n+k)
 *
 * Note :- Counting sort is efficient till k is of order of n.
 * It is often used as a sub-routine for other sorting algorithms like radix sort
 * It is stable sort
 */
public class countingSort1 {
    public static void main(String[] args) {
        int[] arr = {12,7,19,2,11,4,13,5,2,12};
        countingSort(arr);
        System.out.println("Sorted array:");
        for(int i:arr) System.out.print(i+" ");
        System.out.println();

        int[] arr1 = {12,7,19,2,11,4,13,-5,-2,12};
        countingSort(arr1);
        System.out.println("Sorted array:");
        for(int i:arr1) System.out.print(i+" ");
    }

    //main count sort function - negative value compatible
    static void countingSort(int[] a){
        int n = a.length;
        int b[] = new int[n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        //fincding minimum and maximum value in array
        for (int i = 0; i < n; i++) {
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }

//        System.out.println(min+","+max);

        int k = max - min;
        int[] count = new int[k+1];
        //creating count array
        for(int i= 0 ;i < n;i++){
            ++count[a[i]-min];
        }

        //modifying count array for obtaining end position for filling 'b' array
        for (int i = 1; i <= k; i++) {
            count[i] += count[i-1];
        }

        //filling output 'b' array with value from original array at right index till right index
        //reverse filling makes counting sort stable
        for(int i = n-1; i >= 0; i--){
            b[--count[a[i]-min]] = a[i];
        }

        for(int i = 0; i < n; i++){
            a[i] = b[i];
        }
    }
}
