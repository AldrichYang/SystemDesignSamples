package strategy.extend;

/**
 * Created by yh on 8/14/18.
 */
public class Context {
    private ICalculator calculator = null;

    public Context(ICalculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b, String symbol) {
        return this.calculator.exec(a, b);
    }
}
