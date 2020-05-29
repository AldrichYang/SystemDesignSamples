package strategy.generalImpl;

/**
 * Created by yh on 8/14/18.
 */
public class Context {
    private Strategy strategy = null;

    /**
     * 构造函数设置策略
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public void doAnything() {
        this.strategy.doSomething();
    }

}
