package com.ExceptionRelatedThingCheck;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sudhir.ahirkar on 12/13/2017.
 */
class TestException5 extends TestException4{



//    The above program won’t compile because start() method signature is not same in subclass. To fix this issue, we can either change the method singnature in subclass to be exact same as superclass or we can remove throws clause from subclass method as shown below.

    @Override
    public void start(){
    }
/*    public void start() throws IOException{
    }*/

/*    public void start() throws Exception {
    }*/

    public void ok() throws FileNotFoundException {
    }

/*    public void ok() throws Exception {
    }*/

/*    public void foo() throws RuntimeException{

    }*/

/*    public void foo() throws Exception{

    }*/

/*    public void check() throws Exception {

    }*/

    public void check() throws NullPointerException {

    }
}