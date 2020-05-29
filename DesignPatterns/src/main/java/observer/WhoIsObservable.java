package observer;

import java.util.Observable;

/**
 * Created by yh on 17/7/31.
 * 被观察者
 */
public class WhoIsObservable extends Observable {

    public void init() {
        this.addObservers();
    }

    public void addObservers() {
        super.addObserver(new Observer1());
        super.addObserver(new Observer2());
    }

    public void tellWorld() {
        System.out.println("tell followers change");
        this.setChanged();
        this.notifyObservers();
    }


}
