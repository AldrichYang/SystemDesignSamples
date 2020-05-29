package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by yh on 2018/7/4.
 * 具备业务含义的代理类
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, interfaces, handler);
    }
}
