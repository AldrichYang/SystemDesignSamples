package strategy.extend;

/**
 * Created by yh on 8/14/18.
 */
public class Client {
    public static void main(String[] args) {

        impl1();
        implStrategy();
        enumStrategy();
    }

    private static void impl1() {
        Calculator1 calculator = new Calculator1();
        System.out.println("计算器运行结果为:" + calculator.exec(4, 5, "+"));
    }

    private static void implStrategy() {
        final String ADD_SYMBOL = "+";
        final String SUB_SYMBOL = "-";
        String symbol = "+";
        Context context = null;
        if (symbol.equalsIgnoreCase(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equalsIgnoreCase(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }
        System.out.println("计算器运行结果为:" + context.exec(4, 5, "+"));

    }

    private static void enumStrategy() {
        System.out.println("计算器运行结果为:" + Calculator4.ADD.exec(4, 5));

    }
}
