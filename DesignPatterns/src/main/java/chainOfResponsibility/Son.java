package chainOfResponsibility;

/**
 * Created by yh on 2018/7/21.
 */
public class Son implements IHandler {
    @Override
    public void HandleMessage(IWoman woman) {
        System.out.println("母亲的请示是:" + woman.getRequest());
        System.out.println("儿子的回答是同意");
    }
}
