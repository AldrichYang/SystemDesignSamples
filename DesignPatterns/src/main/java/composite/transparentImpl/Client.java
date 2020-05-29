package composite.transparentImpl;

/**
 * Created by yh on 9/7/18.
 */
public class Client {
    public static void main(String[] args) {

    }
// 透明模式避免了类型强制转换
    public static void display(Component component) {
        for (Component component1 : component.getChildren()) {
            if (component1 instanceof Leaf) {
                component1.doSth();
            } else {
                display(component1);
            }
        }
    }
}
