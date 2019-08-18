package com.RemoveListElementByIndexAndObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by sudhir.ahirkar on 12/9/2017.
 */
public class RomeveElementUsingCopyOnWriteArrayList {


    public static void main(String args[]){

//        List<String> lst=new CopyOnWriteArrayList<>();
        List<String> lst=new ArrayList<String>();
        lst.add("Sudhir Ahirkar");
        lst.add("Arjun");
        lst.add("Sagar");

        lst.add("Nilesh");

        System.out.println("List before remove===>"+lst.toString());



        for (int i = 0; i < lst.size(); i++) {

           String st= lst.get(i);

            if(st.length()>6)
                lst.remove(i);

        }

//        for(String st: lst){
//            if(st.length()>6)
//                lst.remove(st);
//        }
        System.out.println("List after remove===>"+lst.toString());




    }
}
