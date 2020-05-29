package strategy.generalImpl;

/**
 * Created by yh on 8/14/18.
 */
public class Client {

    //    高层模块的调用非常简单，知道要用哪个策略，产生出它的对象，然后放到封装角色中就完成任务。
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
