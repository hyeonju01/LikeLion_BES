package week4.Oct_14th.Algorithm;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public void recurSort(int[] arr, int i){
        if (i == arr.length) return;

        for (int j = i; j > 0; j--) {
            if (arr[j] < arr[j-1]) {
                swap(arr, j-1, j);
            }
        }
        recurSort(arr, i+1);
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();
        recursiveInsertionSort.recurSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
