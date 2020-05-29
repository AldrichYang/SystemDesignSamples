package strategy.extend;

/**
 * Created by yh on 8/14/18.
 */
public class Calculator2 {

    private final static String ADD_SYMBOL = "+";
    private final static String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol) {
        return symbol.equalsIgnoreCase(ADD_SYMBOL) ? a + b : a - b;

    }
}
