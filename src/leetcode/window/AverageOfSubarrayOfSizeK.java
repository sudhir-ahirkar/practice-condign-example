package leetcode.window;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        for (int i = 0; i <= arr.length - K; i++) {
            // find sum of next 'K' elements
            double sum = 0;
            for (int j = i; j < i + K; j++)
                sum += arr[j];
            result[i] = sum / K; // calculate average
        }

        return result;
    }

    public static double[] findAveragesOptimize(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1]; // main concept
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= K - 1) { // main
                result[windowStart] = windowSum / K; // calculate the average
                System.out.println("before =>"+windowStart);
                windowSum -= arr[windowStart]; // subtract the element going out
                System.out.println("arr[windowStart]====>"+arr[windowStart]);
                System.out.println("after =>"+windowStart);
                windowStart++; // slide the window ahead
            }
        }
        return result;
    }

    public static void main(String[] args) {
//      double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        double[] result = AverageOfSubarrayOfSizeK.findAveragesOptimize(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of Subarrays of size K: " + Arrays.toString(result));
    }
}
