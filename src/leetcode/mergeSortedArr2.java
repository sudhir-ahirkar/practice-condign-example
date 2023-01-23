package leetcode;

import java.util.Arrays;
import java.util.concurrent.Flow;

public class mergeSortedArr2 {
    public static void main(String[] args) {
        int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
        int[] arr2 = {11,19,27};  // creating a sorted array called arr2

        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays
        Arrays.stream(resultantArray).forEach(System.out::println);

    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int l1 = arr1.length, l2 = arr2.length, i = 0, j = 0, k = 0;
        int[] sortedArr = new int[l1 + l2];
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                sortedArr[k++] = arr1[i++];
            } else {
                sortedArr[k++] = arr2[j++];
            }
        }
        while (i < l1) {
            sortedArr[k++] = arr1[i++];
        }
        while (j < l2) {
            sortedArr[k++] = arr2[j++];
        }
        return sortedArr;
    }
}
