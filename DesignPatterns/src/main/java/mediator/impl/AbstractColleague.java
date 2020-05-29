package mediator.impl;

/**
 * Created by yh on 2018/7/10.
 */
public class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
