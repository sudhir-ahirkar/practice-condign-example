package practice;

import java.lang.reflect.Constructor;

public class TestSingleton {

    public static void main(String[] args) throws NoSuchMethodException, CloneNotSupportedException {
//      Sigleton s1 = new Sigleton(); // Cannot create object as constructor is private
        Sigleton s1 = Sigleton.getInstance();
        Sigleton s2 = Sigleton.getInstance();
        Sigleton s3 = Sigleton.getInstance();
        System.out.println("s1===>"+s1.hashCode());
        System.out.println("s2===>"+s2.hashCode());
        System.out.println("s3===>"+s3.hashCode());
        System.out.println("s5===>"+s3.clone().hashCode());


        Constructor<Sigleton> s4 = Sigleton.class.getDeclaredConstructor();
        s4.setAccessible(true);

        System.out.println("s4====>"+s4.hashCode());

    }
}
