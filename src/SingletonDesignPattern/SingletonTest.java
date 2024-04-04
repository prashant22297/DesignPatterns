package SingletonDesignPattern;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SingletonDesignLazy singletonDesignLazy = SingletonDesignLazy.getSingletonDesign();
        SingletonDesignLazy singletonDesignLazy1 = SingletonDesignLazy.getSingletonDesign();
        System.out.println(singletonDesignLazy.hashCode());
        System.out.println(singletonDesignLazy1.hashCode());

        SingletonDesignEager singletonDesignEager = SingletonDesignEager.getSingletonDesign();
        SingletonDesignEager singletonDesignEager1 = SingletonDesignEager.getSingletonDesign();
        System.out.println(singletonDesignEager.hashCode());
        System.out.println(singletonDesignEager1.hashCode());

        SingletonDesignSync singletonDesignSync = SingletonDesignSync.getSingletonDesign();
        SingletonDesignSync singletonDesignSync1 = SingletonDesignSync.getSingletonDesign();
        System.out.println(singletonDesignSync.hashCode());
        System.out.println(singletonDesignSync1.hashCode());

/*
Break Singleton Classes
1.Using reflection APIs
Solution : --> Two ways:
    1.If object is already created then throw a exception from inside the constructor.
    2. Use enum, instead of a class

2.Deserialization and Serialization: --> while in the process, it may be possible that we try to clone the
object and thus creating another copy .
Solution : --> Implement the readResolve method to return the current singleton object only.

3.Cloning of object:
    Clone the current class object--> This will create the clone of that class object.
    Solution: --> Override the clone method in singleton class to return the current singleton object Only.
 */

//        1.Reflection APIS
//        Constructor<SingletonDesignLazy> declaredConstructor = SingletonDesignLazy.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        SingletonDesignLazy singletonDesignLazy2 = declaredConstructor.newInstance();
//
//        System.out.println(singletonDesignLazy2.hashCode());


//        2.Deserialization and Serialization: -->
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.ob"));
//        objectOutputStream.writeObject(singletonDesignLazy1);
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.ob"));
//        SingletonDesignLazy singletonDesignLazy2 = (SingletonDesignLazy) objectInputStream.readObject();
//        System.out.println(singletonDesignLazy2.hashCode());

//        3.Cloining of object
    }
}
