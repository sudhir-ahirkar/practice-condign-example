package com.inheritance.concept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequance {
  public static void main(String[] args) {
    int nums[] = { 3, 200, 2, 4, 70, 5, 60, 57, 49, 56, 1, 124, 45, 62, 111, 61, 784, 59, 58};
    System.out.println("Original array length: " + nums.length);
    System.out.print("Array elements are: ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println("\nThe new length of the array is: " + longest_sequence(nums));

  }

  private static int longest_sequence(int[] nums) {

    Set<Integer> h_set = new HashSet<Integer>();
    h_set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    int longest_sequence_len = 0;
    for (int i : nums) {
      int length = 1;
      for (int j = i - 1; h_set.contains(j); j--) {

        h_set.remove(j);
        ++length;
      }

      for (int j = i + 1; h_set.contains(j); j++) {
        h_set.remove(j);
        ++length;
      }

      longest_sequence_len = Math.max(longest_sequence_len, length);

    }

    return longest_sequence_len;
  }

//  public static int longest_sequence(int[] nums) {
//    final HashSet<Integer> h_set = new HashSet<Integer>();
//    for (int i : nums)
//      h_set.add(i);
//
//    int longest_sequence_len = 0;
//    for (int i : nums) {
//      int length = 1;
//      for (int j = i - 1; h_set.contains(j); --j) {
//        h_set.remove(j);
//        ++length;
//      }
//      for (int j = i + 1; h_set.contains(j); ++j) {
//        h_set.remove(j);
//        ++length;
//      }
//      longest_sequence_len = Math.max(longest_sequence_len, length);
//    }
//    return longest_sequence_len;
//  }

}
