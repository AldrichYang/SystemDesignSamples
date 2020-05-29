package memento.mementoImpl1;

/**
 * Created by yh on 10/11/18.
 */
public class Client {

    public static void main(String[] args) {
//        声明出主角
        Boy boy = new Boy();
//        初始化当前状态
        boy.setState("心情不错");
        System.out.println("男孩当前的状态：" + boy.getState());
//        记录下当前的状态
        Memento memento = boy.createMemento();
//        男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("男孩追女孩之后的状态:" + boy.getState());
//        追女孩失败，恢复原状
        boy.restoreMemento(memento);
        System.out.println("男孩恢复之后的状态:" + boy.getState());
    }
}
