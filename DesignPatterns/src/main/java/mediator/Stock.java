package mediator;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Stock {

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
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        out.println("清理存货数量为:" + COMPUTER_NUMBER);
        //要求折价销售
        sale.offSale();
        //要求采购人员不要再采购
        purchase.refuseBuyIBM();


    }
}
