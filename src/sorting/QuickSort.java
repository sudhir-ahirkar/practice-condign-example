package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,7,4,3,81,6,25,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low,high);
        System.out.println("Sorted Array using quicksort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pivot = partition1(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1, high);
        }
    }

    private static int partition1(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {

            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }








    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low -1;
        for (int j = low; j<high; j++) {
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap the pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
