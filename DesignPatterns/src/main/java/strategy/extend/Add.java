package strategy.extend;

/**
 * Created by yh on 8/14/18.
 */
public class Add implements ICalculator {

    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
