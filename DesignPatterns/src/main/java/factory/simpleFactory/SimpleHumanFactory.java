package factory.simpleFactory;

import factory.Human;

/**
 * Created by yh on 2018/6/13.
 */
public class SimpleHumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {


        }
        return (T) human;
    }
}
