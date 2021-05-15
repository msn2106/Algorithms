package sorting;

/**
 * Quicksort uses Divide and Conquer Method for sorting
 * It has broadly the steps:-
 * 1.) Select pivot
 * 2.) Find partition position
 * 3.) Break the array such that left side of partition is smaller then the element at partition positon
 * and right side of elements are bigger than the element at the partition position.
 *
 * Time Coomplexity - Best - O(nlogn) and Worst - O(n^2)
 * Space - O(1);
 * This implementation is unstable too.
 */

public class quickSort1 {
    public static void main(String[] args) {
        int[] arr = {7,6,10,5,9,2,1,15,7};
        quickSort1(arr,0,arr.length-1);
        for(int i:arr) System.out.print(i+" ");

        System.out.println();
        int[] a = {-2,11,81,4,-7,8,-2,44,52,4};
        quickSort2(a,0,a.length-1);
        for(int i:a) System.out.print(i+" ");
    }

    //main quicksort1 function -
    // call quicksort recursively after selecting the partition position
    static void quickSort1(int[] arr,int lb,int ub){
        if(lb<ub){
            int partition = partition(arr,lb,ub);
            quickSort1(arr,lb,partition-1);
            quickSort1(arr,partition+1,ub);
        }
    }

    //function for creating partition -
    // returns index of place from where the array is divided into two parts
    // below implementation selects first element as pivot.
    static int partition(int[] a, int lb, int ub){
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while(start < end){
            while(a[start] <= pivot && start < ub){
                start++;
            }
            while (a[end] > pivot){
                end--;
            }
            if(start < end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
//            System.out.println(a[start]+"*"+a[end]);
        }
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;
//        System.out.println(a[lb]+","+a[end]);
//        System.out.println("end:"+end);
        return end;
    }
/********************************************************/
    //main quicksort2
    static void quickSort2(int []arr, int lb, int ub){
        if(lb < ub){
            int part = part(arr,lb,ub);
            quickSort2(arr,lb,part-1);
            quickSort2(arr,part+1,ub);
        }
    }

    //partition function - selects last element as pivot as mentioned in CLSR
    static int part(int[] a, int lb, int ub){
        int x = a[ub];
        int i = lb -1;
        for(int j = lb ; j < ub;j++){
            if(a[j] <= x ){
                i = i+1;
//                System.out.println(i);
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[ub];
        a[ub] = temp;
//        System.out.println(i+1);
        return i+1;
    }
}
