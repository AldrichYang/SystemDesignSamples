package builder;

import static java.lang.System.out;

/**
 * Created by yh on 2018/5/21.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        out.println("奔驰车跑起来的样子...");
    }

    @Override
    protected void stop() {
        out.println("奔驰车这样停车");
    }

    @Override
    protected void alarm() {
        out.println("奔驰车的喇叭声音");
    }

    @Override
    protected void engineBoom() {
        out.println("奔驰车的引擎启动");
    }
}
