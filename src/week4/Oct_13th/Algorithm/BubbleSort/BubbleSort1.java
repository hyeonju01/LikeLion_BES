package week4.Oct_13th.Algorithm.BubbleSort;

import java.util.Arrays;

public class BubbleSort1 {

    public int[] sort(int arr[]) {
        int temp = arr[0];
        for(int i = 0; i < 1; i++) {
            for (int j= 1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        BubbleSort1 bs = new BubbleSort1();
        System.out.println(Arrays.toString(bs.sort(arr)));

    }
}
