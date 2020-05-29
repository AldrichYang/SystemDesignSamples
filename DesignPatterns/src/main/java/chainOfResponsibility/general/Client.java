package chainOfResponsibility.general;

/**
 * Created by yh on 2018/7/21.
 */
public class Client {
    public static void main(String[] args) {
//        声明所有的处理节点
        ConcretHandler1 handler1 = new ConcretHandler1();
        ConcretHandler2 handler2 = new ConcretHandler2();
        ConcretHandler3 handler3 = new ConcretHandler3();
//        设置请求链阶段顺序1->2->3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        Response response = handler1.handleMessage(new Request());
    }
}
