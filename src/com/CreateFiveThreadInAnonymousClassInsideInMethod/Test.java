package com.CreateFiveThreadInAnonymousClassInsideInMethod;

/**
 * Created by sudhir.ahirkar on 12/25/2017.
 */
public class Test extends Thread {


    public static void main(String args[]){

       /* new Test({

            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {

                    System.out.println("Thresd===>"+i);
                }
            }
        });
*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {

                    System.out.println("Thresd===>"+i);
                }
            }
        }).start();
    }
}
