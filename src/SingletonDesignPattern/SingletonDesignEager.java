package SingletonDesignPattern;
//Singleton Design Pattern using Eager Initilization
public class SingletonDesignEager {
    private static SingletonDesignEager singletonDesignEager = new SingletonDesignEager();
    private SingletonDesignEager(){

    }
    public static SingletonDesignEager getSingletonDesign(){
        return singletonDesignEager;
    }
}

//Advantages:-->
//1.Easy to code.

//Disadvatanges:-->
//1.Object is created while class loading time, thus if the user does not requires the object,
//then also the object remains in the memory