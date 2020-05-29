package mediator.generalImpl;

/**
 * Created by yh on 2018/7/11.
 */
public abstract class Mediator {

    //    在Mediator中使用了同事实现类注入，而不是抽象类。因为同事类虽然有抽象，但是没有每个同事类需要完成的业务方法。
//    假如每个同事类有相同的方法，例如execute,handler，那就应该注入抽象类，做到依赖倒置
    private ConcreteColleague1 c1;
    private ConcreteColleague2 c2;

    public abstract void doSth1();

    public abstract void doSth2();

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }
}
