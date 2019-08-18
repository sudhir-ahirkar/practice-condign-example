package com.Pyramid_Pattern_Program;

/**
 * Created by sudhir.ahirkar on 12/2/2017.
 */
public class Pyramid_Pattern {

    public static void main(String args[]) {


//        *
//        **
//        ***
//        ****
//        *****


       /* for (int i = 1; i <= 5; i++) {



            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }
            System.out.println("");
        }*/


//        *****
//        ****
//        ***
//        **
//        *
        /*for (int i = 0; i <= 5; i++) {

            for (int j = 5; j > i; j--) {

                System.out.print("*");

            }
            System.out.println("");
        }*/


//         *
//        * *
//       * * *
//      * * * *
//     * * * * *


//            drawPyramidPattern();
        /*

        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4
        */
//        drawPyramidOfNumbers();

        /*
    0
    01
    0123
    01234
    012345
    */
//        printPattern();
        /*
        1
        22
        333
        4444
        555555*/
//        printAbovePattern();
        /*
        12345
        12345
        12345
        12345
        12345
        */
//        printAbovePattern1();

        /*
        AAAAA
        BBBB
        CCC
        DD
        E
        */


//        printAbovePattern2();
    	
    	
//    	printPatternDummy();
            
            printPatternByMe();
      }

    public static void drawPyramidPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void drawPyramidOfNumbers() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }


    public static void printPattern() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(j);

            }
            System.out.println("");
        }
    }


    public static void printAbovePattern() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(i);

            }
            System.out.println("");
        }
    }


    public static void printAbovePattern1() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(i);

            }
            System.out.println("");
        }
    }

    public static void printAbovePattern2() {

        int a=65;
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >=i; j--) {
                char c=(char)a;

                System.out.print(c);

            }
            System.out.println("");
            a++;
        }
    }
    
   ///===========================================================================================================
    
    
    public static void printPatternDummy() {
    	for(int i =5; i>0; i--) {
    	
    		for(int j =0; j<i; j++) {
        		
        		System.out.print("*");
        	}
    		
    		System.out.println();
    		
    	}
    }

    
    public static void printPatternByMe() {
    	
    	for (int i = 0; i < 5; i++) {
    		
    		for (int j = 0; j < 5-i; j++) {
				
    			System.out.print(" ");
			}
			
    		for (int j = 0; j <= i; j++) {
    			System.out.print("*");
			}
    		System.out.println();
		}
    }
    	


}





