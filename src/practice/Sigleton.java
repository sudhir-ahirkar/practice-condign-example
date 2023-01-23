package practice;

import java.io.Serializable;

final public class Sigleton implements Cloneable, Serializable {

    private static Sigleton singleton = null;

    private Sigleton() {

    }

    {
        if (singleton != null) {
            throw new RuntimeException("Object is already created");
        }
    }

    public static Sigleton getInstance() {
        if (singleton == null) {
            synchronized (Sigleton.class) {
                if (singleton == null) {
                    singleton = new Sigleton();
                }
            }
        }
        return singleton;
    }

   /* @Override
    public Sigleton clone() {
        *//*try {
        return this;
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singleton;
    }

    Object readResolve() {
        return singleton;
    }
}
