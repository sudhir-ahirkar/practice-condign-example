package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 8, 12, 74, 5, 7, 45};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    // time complexity O(n^2)
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
