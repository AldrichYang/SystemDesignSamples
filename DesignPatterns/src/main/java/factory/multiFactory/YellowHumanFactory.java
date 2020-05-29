package factory.multiFactory;

import factory.Human;
import factory.YellowHuman;

/**
 * Created by yh on 2018/6/13.
 */
public class YellowHumanFactory extends AbstractMultiHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
