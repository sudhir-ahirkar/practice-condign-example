package com.recursion.wipro.example;

public class RecurstionStringTest {

	StringBuilder s=new StringBuilder();
//	public static void main(String args[]) {
//		
//		String blogName = "How";
//        
//        String reverseString = reverseString(blogName);
//         
//        System.out.println(reverseString);
//		
//	
//	}
//
//	public static String reverseString(String string)
//    {
//        if (string.isEmpty()){
//         return string;
//        }
//        //Calling function recursively
//        return reverseString(string.substring(1)) + string.charAt(0);
//        
//        
//    }
	
	 /* Function to print reverse of the passed string */
     String reverse(String str) 
    { 
    	
        if ((str==null)||(str.length() <= 1)) 
//           System.out.println(str); 
        s.append(str);
        else
        { 
//            System.out.print(str.charAt(str.length()-1)); 
            s.append(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1)); 
        } 
        
        return s.toString();
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        String str = "Geeks for Geeks"; 
        System.out.println(str.length());
        System.out.println(str.substring(0, str.length()));
        System.out.println(str.substring(0, str.length()-1));
        RecurstionStringTest obj = new RecurstionStringTest(); 
        String reverseString=obj.reverse(str);
        System.out.println(reverseString);
    }     
	
}
