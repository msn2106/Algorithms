package sorting;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {62, 51, 5, 97, 41, 32};

        selectionSort(arr);

        for(int i:arr) System.out.print(i+" ");
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        int small = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[j]<small){
                    small = arr[j];
                }
            }
        }
    }
}
