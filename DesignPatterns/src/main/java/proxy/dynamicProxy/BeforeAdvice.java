package proxy.dynamicProxy;

/**
 * Created by yh on 2018/7/4.
 */
public class BeforeAdvice implements Advice {
    @Override
    public void exec() {
        System.out.println("执行前置通知");
    }
}
