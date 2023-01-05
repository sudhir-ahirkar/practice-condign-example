package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {

       int[] nums = {3,0,1};
       int missing_num = missingNumber(nums);
        System.out.println("missing_num====>"+missing_num);
    }

    public static int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        int expected_sum = (n*(n+1))/2;
        return expected_sum - sum;
    }
}
