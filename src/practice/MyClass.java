package practice;

class MyClass {

    /* Static block */
    static {
        System.out.println("static block");
    }


    /* Non-Static block */
    {
        System.out.println("non-static block");
    }

    /* Constructor */
    MyClass() {
        System.out.println("MyClass constructor");
    }

    public static void main(String[] args) {

        //Create instance of MyClass.
        new MyClass();

    }

}
