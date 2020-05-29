package decorator.generalImpl;

/**
 * Created by yh on 2018/7/25.
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("装饰方法1");
    }

    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
