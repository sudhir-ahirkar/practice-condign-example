package practice;

public class PrimeNumberExample {

    public static void main(String[] args) {
        int num = 23;
        boolean checkIsNumber = isPrimeNumber(num);
        if(checkIsNumber){
            System.out.println(num+" is Prime Number");
        }else{
            System.out.println(num+" is Not Prime Number");
        }
    }

    private static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i==0){
               return false;
            }
        }
        return true;
    }
}
