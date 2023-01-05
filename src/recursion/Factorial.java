package recursion;

public class Factorial {

    public static void main(String[] args) {

      factorial(4);
        System.out.println();
    }

    private static void factorial(int n) {
        getFactorial(n,1);
       int fact = factorialWithoutFact(n);
        System.out.println("Withour fact variable ==>"+fact);
    }

    private static int factorialWithoutFact(int n) {
        if(n==0){
            return 1;
        }
        return n*factorialWithoutFact(n-1);
    }

    private static  void getFactorial(int n, int sum) {
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum*=n;
        getFactorial(n-1,sum);
   }
}
