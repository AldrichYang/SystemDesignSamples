package memento.mementoImpl2;

import memento.mementoImpl1.Boy;

/**
 * Created by yh on 10/11/18.
 */
public class Client {

    public static void main(String[] args) {
//        声明出主角
        Boy boy = new Boy();
//        声明出备忘录的管理者
        Caretaker caretaker = new Caretaker();
//        初始化当前状态
        boy.setState("心情很好");
        System.out.println("男孩现在的状态:" + boy.getState());
//        记录下当前状态
        caretaker.setMemento(boy.createMemento());
//        男孩去追女孩，状态改变
        boy.changeState();
        System.out.println("男孩追女孩子之后的状态：" + boy.getState());
//        追女孩失败恢复原状
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("男孩恢复之后的状态：" + boy.getState());
    }
}
