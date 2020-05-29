package mediator.generalImpl;

/**
 * Created by yh on 2018/7/11.
 */
public class ConcreteColleague1 extends Colleague {
//    同事类使用构造函数注入中介者，而中介者使用get/set方法注入同事类。这是因为同事类必须有中介者，而中介者却可以只有部分同事类。
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }


    public void selfMethod1() {
//处理自己的业务逻辑
    }

    public void depMethod1() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSth1();
    }


}
