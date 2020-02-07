package com.producerconsumer.java8.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;

public class AnnonymousInnerClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    ExecutorService threadPool =Executors.newFixedThreadPool(5);
    Runnable calculateTax = new Runnable() {   /// functionality to execute inner class
      @Override
      public void run() {  /// Anonymous inner class
        //code to calculate tax
        System.out.println(3+5);

      }
    };
    
    Runnable calTaxByLambda=()->{  // shorthand for above code know as lambda
      //code to calculate tax
    };
    
    threadPool.submit(calculateTax); /// Passsing functionality as arguments

//  Note:coceptually lambda is shorthand for anonymous inner classes     
    
    Callable<BigDecimal> calculateTaxUsingCallable = new Callable() {   /// functionality to execute inner class
      @Override
      public BigDecimal call() {  /// Anonymous inner class
        //code to calculate tax
        System.out.println(3+5);
        return null;

      }
    };
    
    
    Callable<BigDecimal> calTaxCallableByLambda=()->{
      return null;  // shorthand for above code know as lambda
      //code to calculate tax
    };
    
    Comparator<User> com=new Comparator<User>() {

      @Override
      public int compare(User o1, User o2) {
        // TODO Auto-generated method stub
        return o1.getId().compareTo(o2.getId());
      }
      
    };
    
    Comparator<User> comparator=(u1,u2)->u1.getId().compareTo(u2.getId());

    //Lambda is a way to encapsulate the functionality and pass as a arguments and that functionality is aslo known as functional interfaces
    
    List<User> lst=getAllUser();
    
    
    
    lst.removeIf(user->{ /// simply lambda
      
      return !user.isActive();
    });
    
   lst.removeIf(user->!user.isActive()); // lambda with grab {}
   
   
   lst.removeIf(new Predicate<User>() {  // Anonymous inner class

    @Override
    public boolean test(User user) {
      // TODO Auto-generated method stub
      return !user.isActive();
    }}
   );
   
   lst.removeIf(user->!user.isActive()); // so here we can say lambda is way to encapsulate the functionality and pass as arguments
   
}

  private static List<User> getAllUser() {
    List<User> lst=new ArrayList<>();
    return lst;
  }
  
}
