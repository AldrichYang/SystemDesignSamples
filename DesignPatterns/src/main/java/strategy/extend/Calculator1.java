package strategy.extend;

/**
 * Created by yh on 8/14/18.
 */
public class Calculator1 {

    private final static String ADD_SYMBOL = "+";
    private final static String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol) {
        int result = 0;
        if (symbol.equalsIgnoreCase(ADD_SYMBOL)) {
            result = add(a, b);
        } else if (symbol.equalsIgnoreCase(SUB_SYMBOL)) {
            result = sub(a, b);
        }
        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }

}
