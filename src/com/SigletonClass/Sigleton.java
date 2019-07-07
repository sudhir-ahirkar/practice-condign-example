package com.SigletonClass;

import java.util.Objects;

/**
 * Created by sudhir.ahirkar on 11/17/2017.
 */
public class Sigleton {

    private static Sigleton sigleton;

   private Sigleton(){

    }
    public static Sigleton getSigleton(){

        if(sigleton==null){
            sigleton=new Sigleton();
        }

        return sigleton;
    }

    public Object clone(){
     return  this;
    }

}
