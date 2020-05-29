package proxy.dynamicProxy;

/**
 * Created by yh on 2018/7/4.
 */
public class RealSubject implements Subject {
    @Override
    public void doSth(String sth) {
        System.out.println("进行业务处理..." + sth);
    }
}
