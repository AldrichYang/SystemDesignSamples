package chainOfResponsibility.chain;

import chainOfResponsibility.IWoman;

/**
 * Created by yh on 2018/7/21.
 */
public class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("----妻子向丈夫请示----");
        System.out.println(woman.getRequest());
        System.out.println("丈夫的回答是：同意");
    }
}
