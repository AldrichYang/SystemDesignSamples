package command;

/**
 * Created by yh on 2018/7/12.
 * 根据客户的命令安排不同的组员进行工作
 */

public class Invoker {

    /**
     * 客户的命令通过字符串传递。系统设计中，通过字符串传递命令并不是一个好方案，因为字符串没有约束力，根据字符串判断相关的业务逻辑不是一个好的解决方案
     * 解决方案:客户的命令封装为一个命令对象.该对象对应明确的操作逻辑，只要接收到直接执行即可
     *
     * @param str
     */
    void setCommand0(String str) {
    }

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }

}
