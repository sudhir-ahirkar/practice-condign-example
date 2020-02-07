package com.producerconsumer.java8.problem;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerProblem {
  private static final int CAPACITY = 2;
  LinkedList<Integer> list = new LinkedList<>();
  private Lock lock = new ReentrantLock();
  private Condition added = lock.newCondition();
  private Condition removed = lock.newCondition();

//  public void produce() throws InterruptedException {  // reentranct lock
//    int count = 0;
//    while(true) {
//      lock.lock();
//      
//      try {
//        while (list.size() == CAPACITY) 
//          removed.await();
//          System.out.println("Producer produced-" + count);
//          list.add(count++);
//          added.signal();
//          Thread.sleep(1000); 
//        
//      } finally {
//        lock.unlock();
//      } 
//    }
//    
//  }
  
  public void produce() throws InterruptedException { /// wait .. notify
    int count = 0;
    while(true) {
//      lock.lock();
      synchronized (this) {
        try {
          while (list.size() == CAPACITY) 
            wait();
            System.out.println("Producer produced-" + count);
            System.out.println(Thread.currentThread().getName());
            list.add(count++);
            notify();
            Thread.sleep(1000); 
          
        } finally {
//          lock.unlock();
        } 
      }
     
    }
    
  }

//  public void consume() throws InterruptedException { // lock
//    while(true) {
//      lock.lock();
//      try {
//        while (list.size() == 0) 
//          added.await();
//          int count = list.removeFirst();
//          removed.signal();
//          System.out.println("Consumer consumed-" + count);
//          Thread.sleep(1000); 
//        
//      } finally {
//        lock.unlock();
//      } 
//    }
//   
//  }
  
  public void consume() throws InterruptedException { // waint notify
    while (true) {
//    lock.lock();
      synchronized (this) {
        try {
          while (list.size() == 0)
            wait();
          int count = list.removeFirst();
          notify();
          System.out.println(Thread.currentThread().getName());
          System.out.println("Consumer consumed-" + count);
          Thread.sleep(1000);

        } finally {
//          lock.unlock();
        } 
      }
     
    }

  }
  
  public static void main(String args[]) throws InterruptedException {
    ProducerConsumerProblem pc = new ProducerConsumerProblem();
    ExecutorService executor = Executors.newFixedThreadPool(3);
    executor.submit(() -> {
      try {
        pc.produce();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    Thread.sleep(2000);

    executor.submit(() -> {
      try {
        pc.consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

  }


}
