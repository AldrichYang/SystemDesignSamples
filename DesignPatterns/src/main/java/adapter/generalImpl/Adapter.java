package adapter.generalImpl;

/**
 * Created by yh on 9/4/18.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSth();
    }
}
