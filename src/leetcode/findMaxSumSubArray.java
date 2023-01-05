package leetcode;

public class findMaxSumSubArray {
    public static int findMaxSumSubArray(int[] arr) {
        // Write - Your - Code
//        int max = Integer.MIN_VALUE;
        int max = arr[0];

        int sum = 0;

        for(int i=0; i<arr.length; i++){

            sum+=arr[i];
            max=Math.max(max,sum);

        }

        return max;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 7, -2, -5, 10, -1};
        int[] arr1 = {-2, 10, 7, -5, 15, 6};
        int maxSumOfArr = findMaxSumSubArray(arr1);
        System.out.println("maxSumOfArr====>"+maxSumOfArr);
    }
}
