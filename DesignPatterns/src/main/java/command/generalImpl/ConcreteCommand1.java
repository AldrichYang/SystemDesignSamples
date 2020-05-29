package command.generalImpl;

/**
 * Created by yh on 2018/7/19.
 */
public class ConcreteCommand1 extends Command {

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.doSomething();
    }
}
