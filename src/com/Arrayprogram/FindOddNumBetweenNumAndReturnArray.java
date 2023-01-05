package com.Arrayprogram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by sudhir.ahirkar on 12/16/2017.
 */
public class FindOddNumBetweenNumAndReturnArray {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
//        int numArry[]= findNumbers(i,j);

      List<Integer> lst =  IntStream.range(i,j).filter(e->e%2!=0).boxed().collect(Collectors.toList());

        Integer[] arr = IntStream.range(i,j).boxed().filter(e->e%2!=0).toArray(Integer[]::new);
        int[] ints = IntStream.range(i, j).filter(e -> e % 2 != 0).toArray();
        System.out.println("Processed Arrays ===>"+Arrays.toString(ints));
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("===================================================");
        Integer numArry[]= findNumbersDifferentWay(i,j);

        for (int num: numArry){
            System.out.println(num);
        }

    }

    public static int[] findNumbers(int i, int j){

        int eleArr[]=new int[j+1];

        for (int k = i; k <= j; k++) {

            if(k%2!=0)
                eleArr[k]=k;

        }



        return eleArr;
    }
//Input 2 5
//  Output
           /*
            0
            0
            0
            3
            0
            5
            */

    public static Integer[] findNumbersDifferentWay(int i, int j){

   List<Integer>  list=new ArrayList<Integer>();
//        HashSet<Integer> hashSet=new HashSet<Integer>();

        for (int k = i; k <= j; k++) {

            if(k%2!=0)
                list.add(k);

        }

        Integer numArr[]=new Integer[list.size()];
//
//        for (int k = 0; k < list.size() ; k++) {
//            numArr[k]=list.get(k);
//        }


//    return numArr;
      return  list.stream().toArray(Integer[]::new);

    }

}
