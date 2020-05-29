package factory;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/12.
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        out.println("人类肤色是：黑色");
    }

    @Override
    public void talk() {
        out.println("黑色人种在说话...");
    }
}
