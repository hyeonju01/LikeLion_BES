package week4.Oct_14th.Algorithm;

import java.util.Arrays;

// 1. 조건문 사용
public class InsertionSort01 {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
                    swap(arr, j-1, j);
                }
            }
        }
        return arr;
            //System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // 시작: arr[1] = 5
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort01 insertionSort01 = new InsertionSort01();
        int[] result = insertionSort01.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
