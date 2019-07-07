package com.RemoveListElementByIndexAndObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by sudhir.ahirkar on 12/9/2017.
 */
public class RemoveListElementByIndexOrObj {

    public static void main(String args[]){

        List<String> lst=new CopyOnWriteArrayList<String>();
        lst.add("Sudhir Ahirkar");
        lst.add("Arjun");
        lst.add("Sagar");

        lst.add("Nilesh");

        System.out.println("List before remove===>"+lst.toString());



       /* for (int i = 0; i < lst.size(); i++) {

           String st= lst.get(i);

            if(st.length()>6)
                lst.remove(i);

        }*/


        /*List before remove===>[Sudhir Ahirkar, Arjun, Sagar, Nilesh]
        Exception in thread "main" java.util.ConcurrentModificationException
        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
        at java.util.ArrayList$Itr.next(ArrayList.java:851)
        at com.RemoveListElementByIndexAndObject.RemoveListElementByIndexOrObj.main(RemoveListElementByIndexOrObj.java:33)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:497)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)*/
      Iterator<String> s= lst.iterator();

     while (s.hasNext()){
        lst.remove(s.next()) ;
     }
        /*for(String st: lst){
            if(st.length()>6)
                lst.remove(st);
        }*/
        System.out.println("List after remove===>"+lst.toString());




    }

}
