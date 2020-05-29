package factory;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/12.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        out.println("人类肤色是：黄色");
    }

    @Override
    public void talk() {
        out.println("黄色人种在说话...");
    }
}
