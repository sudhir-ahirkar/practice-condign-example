package practice;

public class DXCLuxoft {
    public static void main(String[] args) {
        Test obj=new Test();
        Test obj1 = obj;
        obj1.x=20;
        System.out.println(obj.x);
        System.out.println(obj1.x);
    }
}
