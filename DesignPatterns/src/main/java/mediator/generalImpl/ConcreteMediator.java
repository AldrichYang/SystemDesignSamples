package mediator.generalImpl;

/**
 * Created by yh on 2018/7/11.
 */
//具体中介者一般只有一个，即通用中介者
public class ConcreteMediator extends Mediator {
//    中介者所具有的方法doSth1，doSth2都是比较复杂的业务逻辑，为同事类服务，其实现是依赖多个同事类来完成的。
    @Override
    public void doSth1() {
        super.getC1().selfMethod1();
        super.getC2().selfMethod2();
    }

    @Override
    public void doSth2() {
        super.getC1().selfMethod1();
        super.getC2().selfMethod2();

    }
}
