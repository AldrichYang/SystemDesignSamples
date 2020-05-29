package memento.simpleImpl;

/**
 * Created by yh on 10/11/18.
 */
public class Client {
    public static void main(String[] args) {

        originImpl();

    }

    static void originImpl() {
        Boy boy = new Boy();
//        初始化当前状态
        boy.setState("心情不错");
        System.out.println("男孩现在的状态:" + boy.getState());
//        需要记录下当前的状态
        Boy backUp = new Boy();
        backUp.setState(boy.getState());
//        男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("男孩追女孩之后的状态:" + boy.getState());
//        追女孩失败， 恢复原状
        boy.setState(backUp.getState());
        System.out.println("男孩恢复后的状态:" + boy.getState());
    }
}
