package SingletonDesignPattern;

import java.io.Serializable;

//Singleton Design Pattern using Lazy Initilization
public class SingletonDesignLazy implements Serializable, Cloneable {
    private static SingletonDesignLazy singletonDesignLazy;

    private SingletonDesignLazy() {
        if (singletonDesignLazy != null)
            throw new RuntimeException("You Are trying to break the Singleton Pattern.");
    }

    public static SingletonDesignLazy getSingletonDesign() {
        if (singletonDesignLazy == null) {
            singletonDesignLazy = new SingletonDesignLazy();
        }
        return singletonDesignLazy;
    }

    //    This method is for avoidign the break in singleton while deserilization
    private Object readResolve() {
        return singletonDesignLazy;
    }

    //    This method is used to avoid the break in singleton while cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        return singletonDesignLazy;
//        Below line is used for cloning an object
//        return super.clone();
    }
}
//Advatages:-->
//1.Object is only created ,when required by the user. Thus saves space.

//Disadvatages:-->
//1. Thread is not safe.(Singleton fails in case of Multi threaded thread)
//    Solution: --> Use of synchronized method --> synchronized block
//2. 1st time code execuation may take some time in object creation.
