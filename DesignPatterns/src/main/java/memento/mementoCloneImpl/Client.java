package memento.mementoCloneImpl;

/**
 * Created by yh on 10/11/18.
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("初始状态...");
        System.out.println("初始状态是：" + originator.getState());
//        创建备份
        originator.createMemento();
//        修改状态
        originator.setState("修改后的状态");
        System.out.println("修改后状态是：" + originator.getState());
//        恢复原有的状态
        originator.restoreMemento();
        System.out.println("恢复后的状态是：" + originator.getState());
    }
}
