package com.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {
       int[] nums = {3,2,2,3}; int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        Integer [] lst = Arrays.stream(nums).boxed().filter(e->e!=val).toArray(value -> new Integer[value]);
        Integer [] lst1 = Arrays.stream(nums).boxed().filter(e->e!=val).toArray(Integer[]::new);
        int [] lst2 = Arrays.stream(nums).filter(e->e!=val).toArray();
//        Arrays.stream(lst).forEach(integer -> System.out.println(integer));
        return lst.length;
    }
}
