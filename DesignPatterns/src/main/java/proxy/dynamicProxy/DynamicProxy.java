package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by yh on 2018/7/4.
 * 通用代理类，不具备业务意义
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
