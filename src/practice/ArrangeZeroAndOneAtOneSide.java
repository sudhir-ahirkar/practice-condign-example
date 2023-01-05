package practice;

import java.util.Arrays;

public class ArrangeZeroAndOneAtOneSide {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
//        reArrangeZeroAtLeftSide(arr);
//        reArrangeZeroAtRightSide(arr);
//        reArrangeZeroAtLeftSideUsingTwoPointer(arr);
//        reArrangeZeroAtRightSideUsingTwoPointer(arr);
//        reArrangeZeroAtLeftSideUsingTwoPointerButDifferentWay(arr);
        reArrangeZeroAtRightSideUsingTwoPointerButDifferentWay(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reArrangeZeroAtLeftSideUsingTwoPointerButDifferentWay(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    private static void reArrangeZeroAtRightSideUsingTwoPointerButDifferentWay(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    private static void reArrangeZeroAtLeftSideUsingTwoPointer(int[] arr) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[right] != 0) {
                right++;
            } else {
//            if (arr[left] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
                left++;
            }
        }
    }

    private static void reArrangeZeroAtRightSideUsingTwoPointer(int[] arr) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[right] != 0) {
                right++;
            } else {
//            if (arr[left] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
                left++;
            }
        }
    }

    private static void reArrangeZeroAtLeftSide(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 1;
        }
    }

    private static void reArrangeZeroAtRightSide(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
