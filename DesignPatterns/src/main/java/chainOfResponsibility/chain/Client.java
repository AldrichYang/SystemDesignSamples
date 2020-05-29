package chainOfResponsibility.chain;

import chainOfResponsibility.IWoman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by yh on 2018/7/21.
 */
public class Client {

    /**
     * 业务调用类Client不需要判断到底需要谁去处理，而且Handler的抽象类可以继续增加
     * 只需要扩展传递链即可
     * 调用类可以不用了解变化过程，甚至谁在处理请求都不用知道。
     * 反正只要请示第一个人父亲类即可。
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        List<IWoman> womanList = new ArrayList<>();
        Collections.nCopies(5, 0).stream().forEach(x -> womanList.add(new Woman(random.nextInt(4), "我要出去逛街")));
//        定义3个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        womanList.forEach(father::HandleMessage);
    }
}
