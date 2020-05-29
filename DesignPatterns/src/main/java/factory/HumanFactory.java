package factory;

/**
 * Created by yh on 2018/6/12.
 */
public class HumanFactory extends AbstracHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {


        }
        return (T) human;
    }
}
