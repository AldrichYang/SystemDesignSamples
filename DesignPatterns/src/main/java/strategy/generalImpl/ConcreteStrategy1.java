package strategy.generalImpl;

/**
 * Created by yh on 8/14/18.
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }

}
