package chainOfResponsibility;

/**
 * Created by yh on 2018/7/21.
 */
public class Husband implements IHandler {
    @Override
    public void HandleMessage(IWoman woman) {
        System.out.println("妻子的请示是:" + woman.getRequest());
        System.out.println("丈夫的回答是同意");

    }
}
