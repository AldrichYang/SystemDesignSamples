package mediator;

import java.util.Random;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Sale {

    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
//            库存数量不够销售
            purchase.buyIBMcomputer(number);
        }
        out.println("销售IBM电脑:" + number + "台");
        stock.decreaseNumber(number);
    }

    //反馈销售情况：0~100变化，0代表没人买,100代表非常畅销
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        out.println("IBM电脑销售情况是:" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
//        库存有多少卖多少
        Stock stock = new Stock();
        out.println("折价销售IBM电脑:" + stock.getStockNumber() + "台");

    }


}
