package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by yh on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSth("Finish");

        proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSth("Finish");
    }
}
