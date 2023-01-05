package practice;

import java.util.Arrays;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        int num = 8;
        int[] arr = getFibonacciSeries(num);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getFibonacciSeries(int num) {
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        // 0 1 1 2 //0 1 2 3
        return arr;
    }
}
