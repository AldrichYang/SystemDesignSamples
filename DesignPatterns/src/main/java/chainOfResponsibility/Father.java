package chainOfResponsibility;

/**
 * Created by yh on 2018/7/21.
 */
public class Father implements IHandler {
    @Override
    public void HandleMessage(IWoman woman) {
        System.out.println("女儿的请示是:" + woman.getRequest());
        System.out.println("父亲的回答是同意");
    }
}
