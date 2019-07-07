package com.CognisTest;

import java.util.PriorityQueue;

public class Priorites {
    public static void main(String[] args) {
        PriorityQueue toDo=new PriorityQueue();
        toDo.add("dishes");
        toDo.add("laundry");
        toDo.add("bills");
        toDo.offer("bills");
        /*System.out.println(toDo.size()+" "+toDo.poll());
        System.out.println(" "+toDo.peek()+" "+toDo.poll());
        System.out.println(" "+toDo.poll()+" "+toDo.poll());*/

        System.out.print(toDo.size()+" "+toDo.poll());
        System.out.print(" "+toDo.peek()+" "+toDo.poll());
        System.out.print(" "+toDo.poll()+" "+toDo.poll());
    }
}
