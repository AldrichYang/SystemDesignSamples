package factory.multiFactory;

import factory.BlackHuman;
import factory.Human;

/**
 * Created by yh on 2018/6/13.
 */
public class BlackHumanFactory extends AbstractMultiHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
