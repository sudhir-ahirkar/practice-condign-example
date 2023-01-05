package practice;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NeedToTry {
    //LongestConsecutiveSequance

    public static void main(String[] args) {
        int nums[] = {3, 200, 2, 100, 70, 105, 60, 57, 49, 56, 1, 124, 45, 62, 111, 61, 784, 59, 6};
        System.out.println("Original array length: " + nums.length);
        System.out.print("Array elements are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nThe new length of the array is: " + longest_sequence(nums));

    }

    private static int longest_sequence(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Integer max_length = 0;
        for (int i = 0; i < set.size(); i++) {
            int length = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (set.contains(j)) {
                    length++;
                    set.remove(j);
                }
            }
            for (int j = i - 1; j < nums.length; j--) {
                if (set.contains(j)) {
                    length++;
                    set.remove(j);
                }
            }

            max_length = Math.max(length,max_length);

        }
        return max_length;
    }
}
