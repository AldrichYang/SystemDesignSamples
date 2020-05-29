package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yh on 2018/7/4.
 */
public class GamePlayerIH implements InvocationHandler {
    // 被代理者
    Class cls = null;
    // 被代理类示例
    Object obj = null;

    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人使用我的账号登录");
        }
        return result;
    }
}
