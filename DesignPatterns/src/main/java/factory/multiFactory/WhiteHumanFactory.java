package factory.multiFactory;

import factory.Human;
import factory.WhiteHuman;

/**
 * Created by yh on 2018/6/13.
 */
public class WhiteHumanFactory extends AbstractMultiHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
