package mediator;

/**
 * Created by yh on 2018/7/10.
 */
public class Client {
    public static void main(String[] args) {
        //采购人员采购电脑
        System.out.println("-----采购人员采购电脑------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);
        //销售人员销售电脑
        System.out.println("-----销售人员销售电脑------");
        Sale sale = new Sale();
        sale.sellIBMComputer(2);
        //库存管理人员管理库存
        System.out.println("-----库存人员管理库存------");
        Stock stock = new Stock();
        stock.clearStock();

    }
}
