package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yh on 17/7/31.
 * 观察者1
 */
public class Observer1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer1 receive the change");
        doSth();
    }

    private void doSth() {
        System.out.println("I am observer 1");
    }
}
