package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        selectionSort(arr);

        for(int i:arr) System.out.print(i+" ");
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int index = 0,j=0;
            for (j = i+1; j < n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            if(min != arr[i]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
