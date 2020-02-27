package bny.test;

public enum Code {
  ABOSTE, BBBBB,CCCC,DDDD;
//I/P
//10001
//10002
//10003
//10004
  
  public static Code method(int code) {
    
   switch (code) {
    case 10001:
      return ABOSTE;
//      break;
    
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
  
  public static void main(String[] args) {
   Code c= Code.method(10008);
   System.out.println(c);
  }
}
