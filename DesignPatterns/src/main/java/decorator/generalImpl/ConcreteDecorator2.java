package decorator.generalImpl;

/**
 * Created by yh on 2018/7/25.
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("装饰方法2");
    }

    @Override
    public void operate() {
        super.operate();
        method2();
//        原始方法和装饰方法的执行顺序在装饰类中是固定的，可以通过方法重载实现多种执行顺序
    }
}
