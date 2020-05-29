package mediator;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Purchase {

    public void buyIBMcomputer(int number) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
//            销售情况良好
            out.println("采购IBM电脑:" + number + "台");
            stock.increaseNumber(number);
        } else {
//            销售情况不好
            int buyNumber = number / 2;
            out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    public void refuseBuyIBM() {
        out.println("不再采购IBM电脑");
    }
}
