package week4.Oct_14th.Algorithm;

import java.util.Arrays;

public class InsertionSort02 {

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j]<arr[j-1]; j--) {
                swap(arr, j-1, j);
            }
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
        int[] arr={8, 5, 6, 2, 4};
        InsertionSort02 insertionSort = new InsertionSort02();
        insertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}