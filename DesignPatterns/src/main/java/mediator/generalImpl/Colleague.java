package mediator.generalImpl;

/**
 * Created by yh on 2018/7/11.
 */
//同事角色的抽象很简单，主要是为了建立这个中介而服务
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
