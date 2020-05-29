package decorator.generalImpl;

/**
 * Created by yh on 2018/7/25.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
//        第一次修饰
        component = new ConcreteDecorator1(component);
//        第二次修饰
        component = new ConcreteDecorator2(component);
//        装饰完毕之后运行
        component.operate();
    }
}
