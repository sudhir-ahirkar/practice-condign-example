package practice;

import java.util.Arrays;

public class  FindGivenElement {

    public static void main(String[] args) {
        // Given Array
        int[] arr = {0, 2, 1, 3, -1, 8,0};
        // Target element which need to find in given array
        int target = 3;
        // sort the given array
        int[] sortedArr = sort(arr);

        System.out.println(Arrays.toString(sortedArr));

        // search the target in element in sorted array

        int result = search(sortedArr,target);
        System.out.println("result==>"+result);

        // or we can simply sort and search using Java stream
        boolean isNumFound = Arrays.stream(arr).anyMatch(e->e==target);
    }

    // There are many ways to sort the array like (selection, insert, bubble)->O(n2), merge O(nlogn), quick (best case O(nlogn) but worst case O(n2) .. ect but
    private static int[] sort(int[] arr) {

        // Merge sort algorithm
/*      1.  Declare left, right, mid variable and also have target element and given array

        2.  perform sorting using divide and conquer strategy

        if(left<right)

            - calculate the mid value so Array can be devide

        mid = left + (right-left)/2 // find the middle point to devide the array into two halves

                1. devide(arr,left,mid); //call devide for first half
                2. devide(arr,mid+1,right); ////call devide for first half
                3. conquer(arr,right,mid,right); // conquer/merge two halves sorted in step1 and step2

        3. stop*/

        Arrays.sort(arr); // Here using predefined the Array sort method which internally used tim Sort (it is combination of
//        insertion and mergeSort and


     return arr;
    }

    // if array is sorted then we can search given element in array in O(logn) complexity
    private static int
    search(int[] arr, int target){

        // here we have binarySearch funcion in Array class as well
//         return Arrays.binarySearch(arr,target);
//        int lhs = 0, rhs=arr.length-1, result = -1;
//        while(lhs<=rhs){
//            int mid = (lhs) + (rhs-lhs)/2;
//            if(target>arr[mid]){
//                lhs = mid+1;
//            }else if (arr[mid]==target){
//                result = 1;
//                System.out.println("mid==>"+mid);
//                break;
//            }else {
//                rhs = mid -1;
//            }
//        }
//        return result ;


//         Binary Search to find the element in O(lon(n)) complexity

         int lhs=0; int rhs=arr.length-1;
          int result = -1;
         while(lhs<=rhs){
           int mid = (lhs+rhs)/2;
           if(arr[mid]<target){
             lhs = mid+1;
           }else if (arr[mid]==target){
             result = mid;
            break;
           }else{
             rhs = mid-1;
           }
         }
         return result;
    }
}
