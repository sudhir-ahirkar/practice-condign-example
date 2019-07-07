package com.FindOutMissingNumberInArray;

import java.util.Arrays;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Ok {



        static Integer ars[]={1,5,6,7,9,2,3,4};

        public static void main(String args[]){

            Arrays.sort(ars);

            int size=ars.length+1;

            int expectedTotal=size*(size+1/2);

            System.out.println("expectedTotal===."+expectedTotal);


        }


}
