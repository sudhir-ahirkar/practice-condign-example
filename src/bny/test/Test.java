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
  
 int l= getListBinaryNum(14);
  
  

  }

  private static int getListBinaryNum(int i) {
    int l = 19; 
    // returns the string representation of the unsigned int value 
    // represented by the argument in binary (base 2) 
    System.out.println("Binary is " + Integer.toBinaryString(l)); 

    l = 9; 
    System.out.println("Binary is " + Integer.toBinaryString(l)); 
    
    String binary=Integer.toBinaryString(l);
    System.out.println(binary);
    
    String bs=convertIntToBinary(19);
    System.out.println(bs);
    
    return l;
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
  
  public Code method(int code) {
    
    switch (code) {
     case 10001:
       return ABOSTE;
//       break;
     
      case 10002:
         
        return BBBBB;
         
      case 10003:
        
        return CCCC;
        
      case 10004:
        
        return DDDD;

     default :
       
       throw new IllegalArgumentException("code not found");
   }
  
     
     
   }

}
