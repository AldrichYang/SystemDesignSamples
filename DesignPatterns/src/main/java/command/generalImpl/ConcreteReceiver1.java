package command.generalImpl;

/**
 * Created by yh on 2018/7/19.
 */
public class ConcreteReceiver1 extends Receiver {
    /**
     * 每个接受者处理一定的业务逻辑
     * 这里有个问题：Command对应的业务逻辑，应该放在Receiver中，还是Command的功能中。目前来看是在Receiver中
     *
     */
    @Override
    public void doSomething() {

    }
}
