package mediator.impl;

import java.util.Random;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        out.println("销售IBM电脑:" + number + "台");
    }

    //反馈销售情况：0~100变化，0代表没人买,100代表非常畅销
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        out.println("IBM电脑销售情况是:" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");

    }
}

