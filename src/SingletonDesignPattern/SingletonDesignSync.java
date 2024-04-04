package SingletonDesignPattern;

import java.util.Stack;

public class SingletonDesignSync {
    private static SingletonDesignSync singletonDesignSync;
    private SingletonDesignSync(){

    }

    public static SingletonDesignSync getSingletonDesign(){
        if(singletonDesignSync == null){
            synchronized (SingletonDesignSync.class){
                if (singletonDesignSync==null){
                    singletonDesignSync = new SingletonDesignSync();
                }
            }
        }
        return singletonDesignSync;
    }
}

//Synchronized block is more efficient than synchoronized method as we want only one line of code to be executed
//one by one. thus it reduces the waiting time of other threads.
