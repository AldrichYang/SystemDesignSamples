package chainOfResponsibility.chain;

import chainOfResponsibility.IWoman;

import java.util.Objects;

/**
 * Created by yh on 2018/7/21.
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    // 能处理的级别
    private int level = 0;
    // 责任传递，下一个责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMessage(IWoman woman) {
        if (woman.getType() == this.level) {
            this.response(woman);
        } else {
            if (!Objects.isNull(nextHandler)) {
                this.nextHandler.HandleMessage(woman);
            } else {
                System.out.println("没有责任人负责处理了，认为请求不同意");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IWoman woman);
}
