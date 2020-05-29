package mediator.generalImpl;

/**
 * Created by yh on 2018/7/11.
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }


    public void selfMethod2() {
//处理自己的业务逻辑
    }

    public void depMethod2() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSth2();
    }
}
