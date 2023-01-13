package leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 8};
        int target = 1;
        int insertIndex = searchInsert(nums,target);
        System.out.println("Element need to insert at position "+insertIndex);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
               end = mid-1;
            } else if (target > nums[mid]) {
               start  = mid+1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        return start;
    }
}
