package proxy.generalImpl;

/**
 * Created by yh on 2018/6/29.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    // 默认被代理者，不常用
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递被代理者
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    /**
     * 实现接口中定义的方法
     * 扩展代理类的一些支持
     */
    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        //预先处理
    }

    private void after() {
        //善后处理
    }
}
