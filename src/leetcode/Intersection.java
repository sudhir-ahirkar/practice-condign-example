package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*349. Intersection of Two Arrays

         Given two integer arrays nums1 and nums2, return an array of their intersection.
         Each element in the result must be unique and you may return the result in any order.

        Example 1:
        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]

        Example 2:
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [9,4]
        Explanation: [4,9] is also accepted.

        Constraints:
        1 <= nums1.length, nums2.length <= 1000
        0 <= nums1[i], nums2[i] <= 1000*/

public class Intersection {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ansArr = intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
                set.remove(i);
            }
        }
        int[] ansArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ansArr[i] = result.get(i);
        }
        return ansArr;
    }
}
