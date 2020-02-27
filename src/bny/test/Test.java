package bny.test;

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
//    1) 
//
//  m(int n){
//   Integer.toBinary(n);
// }
//
//
// 2)
//
// I/P
// 10001
// 10002
// 10003
// 10004
//
// O/p Enum ABOSTE, BBBBB,CCCC,DDDD
// class Enum
// {
//
//  Enum method(int code)
//  {
//  if(code==10001){
//  return ABOSTE;
//  }else{
//  throw new IllegalArgumentException("Unexpected value '" + text + "'");
//  }
//  
//  }
// }
//
//
// 3)I/P: arr[1,1,3,3,2], int var(3) subsequently double and retutn max value
// 2
// O/p: 
//
//
// 4) Buetiful arrangement problems:
//    https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/solutions-501-550/526-beautiful-arrangement.html

    
    int[] intArr= {1,1,3,4,6,8,10,14,6,7,23,12,45};
    int j=3;
    
    
    
  int maxVal=  returnMaxVal(intArr,j);
  System.out.println(maxVal);
  
 int l= getListBinaryNum(5548);
 System.out.println(l);
  
  

  }

  private static int getListBinaryNum(int i) {
//    int l = 19; 
    // returns the string representation of the unsigned int value 
    // represented by the argument in binary (base 2) 
//    System.out.println("Binary is " + Integer.toBinaryString(i)); 

//    l = 9; 
//    System.out.println("Binary is " + Integer.toBinaryString(l)); 
//    
    String binary=Integer.toBinaryString(i);
//    System.out.println(new StringBuilder(binary).reverse());
   String s= new StringBuilder(binary).reverse().substring(3, 4);
//   System.out.println(s);
//    System.out.println(binary);
    
//    String bs=convertIntToBinary(19);
//    System.out.println(bs);
//   Assert.assertEquals(1,Integer.parseInt(s));
    
    return Integer.parseInt(s);
  }

  private static String convertIntToBinary(int n) {
    String x = "";
    while (n > 0) {
      int a = n % 2;
      x = a + x;
      n = n / 2;
    }
    return x;
  }

  private static int returnMaxVal(int[] intArr, int j) {
    Arrays.sort(intArr);
    for (int i = 0; i < intArr.length; i++) {
      if (intArr[i] == j) {
        // System.out.println(intArr[i]*2);
        // j=intArr[i]*2;
        j = j * 2;
        // intArr[i]=intArr[i]*2;
      }
    }
    // Arrays.stream(intArr).forEach(System.out::println);
    return j;
  }
  
 

}
