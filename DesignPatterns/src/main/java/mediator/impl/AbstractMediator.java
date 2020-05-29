package mediator.impl;
import mediator.Sale;
import mediator.Stock;
import mediator.Purchase;

/**
 * Created by yh on 2018/7/10.
 */
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }

    public abstract void execute(String method, Object... objects);


}
