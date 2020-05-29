package mediator.impl;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/10.
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String method, Object... objects) {
        switch (method) {
            case "purchase.buy":
                this.buyComputer((Integer) objects[0]);
                break;
            case "sale.sell":
                this.sellComputer((Integer) objects[0]);
                break;
            case "sale.offsell":
                this.offSale();
                break;
            case "stock.clear":
                this.clearStock();
                break;
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
//            销售情况良好
            out.println("采购IBM电脑:" + number + "台");
            super.stock.increaseNumber(number);
        } else {
//            销售情况不好
            int buyNumber = number / 2;
            out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    public void sellComputer(int number) {
        if (stock.getStockNumber() < number) {
//            库存数量不够销售
            purchase.buyIBMcomputer(number);
        }
        out.println("销售IBM电脑:" + number + "台");
        stock.decreaseNumber(number);
    }

    public void offSale() {
//        库存有多少卖多少
        out.println("折价销售IBM电脑:" + stock.getStockNumber() + "台");

    }

    public void clearStock() {
        //要求折价销售
        sale.offSale();
        //要求采购人员不要再采购
        purchase.refuseBuyIBM();


    }
}
