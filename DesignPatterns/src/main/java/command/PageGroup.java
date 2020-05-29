package command;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/12.
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        out.println("找到页面组...");
    }

    @Override
    public void add() {
        out.println("客户要求增加一个页面...");
    }

    @Override
    public void delete() {
        out.println("客户要求删除一个页面...");
    }

    @Override
    public void change() {
        out.println("客户要求变更一个页面");
    }

    @Override
    public void plan() {
        out.println("客户需要页面变更计划...");
    }

    @Override
    public void rollback() {

    }
}
