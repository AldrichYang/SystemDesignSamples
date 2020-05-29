package factory;

/**
 * Created by yh on 2018/6/12.
 */
public abstract class AbstracHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
