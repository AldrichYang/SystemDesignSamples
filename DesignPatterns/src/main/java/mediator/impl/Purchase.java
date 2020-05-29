package mediator.impl;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        out.println("不再采购IBM电脑");
    }
}
