package leetcode;

import java.util.HashMap;
import java.util.Map;
//532. K-diff Pairs in an Array
/*
       Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
        A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

        0 <= i, j < nums.length
        i != j
        nums[i] - nums[j] == k
        Notice that |val| denotes the absolute value of val.

        Example 1:
        Input: nums = [3,1,4,1,5], k = 2
        Output: 2
        Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
        Although we have two 1s in the input, we should only return the number of unique pairs.
        Example 2:

        Input: nums = [1,2,3,4,5], k = 1
        Output: 4
        Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
        Example 3:
        Input: nums = [1,3,1,5,4], k = 0
        Output: 1
        Explanation: There is one 0-diff pair in the array, (1, 1).

        Constraints:
        1 <= nums.length <= 104
        -107 <= nums[i] <= 107
        0 <= k <= 107
        */
public class FindPairs {
    public static void main(String[] args) {
//      int[] numbers = {3,1,4,1,5}; int k = 2;
        int[] numbers = {1, 3, 1, 5, 4};
        int k = 0;
        int pairCount = findPairs(numbers, k);
        System.out.println("PairCount ====>" + pairCount);
    }

    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
