package adapter.generalImpl;

/**
 * Created by yh on 9/4/18.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need my help ,please call me");
    }
}
