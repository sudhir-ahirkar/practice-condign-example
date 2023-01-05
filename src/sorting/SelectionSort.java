package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 12, 74, 5, 7, 45};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    // time complexity O(n^2)

    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
