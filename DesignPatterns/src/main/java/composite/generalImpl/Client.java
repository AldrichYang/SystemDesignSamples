package composite.generalImpl;

/**
 * Created by yh on 9/7/18.
 */
public class Client {
    public static void main(String[] args) {
//        创建一个根节点
        Composite root = new Composite();
        root.doSomething();
//        创建一个树枝构件
        Composite branch = new Composite();
//        创建一个叶子节点
        Leaf leaf = new Leaf();
//        建立整体
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    //    通过递归遍历树
    public static void display(Composite root) {
        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {
                component.doSomething();
            } else {
                display((Composite) component);
            }
        }
    }
}
