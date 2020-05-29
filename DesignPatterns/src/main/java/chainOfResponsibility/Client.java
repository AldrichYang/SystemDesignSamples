package chainOfResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by yh on 2018/7/21.
 */
public class Client {
    public static void main(String[] args) {
        originDesign();

    }

    /**
     * 1. 职责界定不清晰。例如女儿的请求，应该是父亲类对应处理。父亲类应该知道女儿的请求自己处理，而不是client类中组装出来
     * 2. 代码臃肿。client中写了大量的if判断，如果请求人员越多，if膨胀
     * 3. 耦合过重。根据Women的type决定使用那个Ihandler实现。实现类继续扩展，必须修改Client，不符合开闭原则
     * 4. 异常情况欠考虑。妻子只能向丈夫请示吗？如果妻子向父亲请示，怎么处理。逻辑缺失
     * <p>
     * 需求分析：
     * 1. 女性提出请示，必然得到答复，不管同意或者不同意
     * 2. 父亲，丈夫，儿子三个节点有两个选择，要么承担责任，做出回应；要么请求转发到后序环节
     */
    private static void originDesign() {
        Random random = new Random();
        List<IWoman> womanList = new ArrayList<>();
        Collections.nCopies(5, 0).stream().forEach(x -> womanList.add(new Woman(random.nextInt(4), "我要出去逛街")));
//        定义3个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        womanList.forEach(x -> {
            switch (x.getType()) {
                case 1:
                    System.out.println("----女儿向父亲请示----");
                    father.HandleMessage(x);
                    break;
                case 2:
                    System.out.println("----妻子向丈夫请示----");
                    husband.HandleMessage(x);
                case 3:
                    System.out.println("----母亲向儿子请示----");
                    son.HandleMessage(x);
            }
        });
    }
}
