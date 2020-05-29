package mediator.impl;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increaseNumber(int number) {
        COMPUTER_NUMBER += number;
        out.println("库存数量是:" + COMPUTER_NUMBER);
    }

    public void decreaseNumber(int number) {
        COMPUTER_NUMBER -= number;
        out.println("库存数量是:" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        out.println("清理存货数量为:" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");


    }
}
