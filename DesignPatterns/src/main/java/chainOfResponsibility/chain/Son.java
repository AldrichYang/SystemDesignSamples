package chainOfResponsibility.chain;

import chainOfResponsibility.IWoman;

/**
 * Created by yh on 2018/7/21.
 */
public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("----母亲向儿子请示----");
        System.out.println(woman.getRequest());
        System.out.println("儿子的回答是：同意");
    }
}
