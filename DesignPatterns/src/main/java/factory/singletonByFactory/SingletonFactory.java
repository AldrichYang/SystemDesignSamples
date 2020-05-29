package factory.singletonByFactory;

import java.lang.reflect.Constructor;

/**
 * Created by yh on 2018/6/13.
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {

            Class c1 = Class.forName(Singleton.class.getName());
            Constructor constructor = c1.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {

        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
