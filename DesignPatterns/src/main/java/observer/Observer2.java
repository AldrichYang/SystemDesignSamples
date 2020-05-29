package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yh on 17/7/31.
 * 观察者2
 */
public class Observer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer2 receive the change");
        doSth();
    }

    private void doSth() {
        System.out.println("I am observer 2");
    }


}
