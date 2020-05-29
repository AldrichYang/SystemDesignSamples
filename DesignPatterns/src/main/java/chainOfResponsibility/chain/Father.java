package chainOfResponsibility.chain;

import chainOfResponsibility.IWoman;

/**
 * Created by yh on 2018/7/21.
 * <p>
 * 构造方法都是必须实现的，父类框定子类必须有一个显式的构造函数，子类实现编译不通过.
 * 通过构造方法可以限定各个类能处理的请求类型，Father只处理女儿的请求，Son只处理母亲的请求...
 * 在handler中已经判断，如果没有没有相应的处理者，认为是不同意
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("----女儿向父亲请示----");
        System.out.println(woman.getRequest());
        System.out.println("父亲的回答是：同意");
    }
}
