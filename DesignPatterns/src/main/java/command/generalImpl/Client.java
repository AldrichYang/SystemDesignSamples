package command.generalImpl;

/**
 * Created by yh on 2018/7/19.
 */
public class Client {
    public static void main(String[] args) {
//        声明调用者
        Invoker invoker = new Invoker();
//        定义接受者
        Receiver receiver1 = new ConcreteReceiver1();
//        定义一个发送给接受者的命令
        Command command = new ConcreteCommand1(receiver1);
//        把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();

    }

    /**
     * 高层模块和接受者解耦。
     * 在命令中指定接受者，更加内聚
     */
    public static void withoutKnowReceiver() {
        Invoker invoker = new Invoker();
//        定义一个发送给接受者的命令
        Command command = new ConcreteCommand2();
//        把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();
    }
}
