package command.generalImpl;

/**
 * Created by yh on 2018/7/19.
 */
public class ConcreteCommand2 extends Command {
    private Receiver receiver;

    public ConcreteCommand2() {
        this.receiver = new ConcreteReceiver2();
    }

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
