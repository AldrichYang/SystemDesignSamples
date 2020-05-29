package command;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/12.
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        out.println("找到需求组...");
    }

    @Override
    public void add() {
        out.println("客户要求增加一个需求...");
    }

    @Override
    public void delete() {
        out.println("客户要求删除一个需求...");
    }

    @Override
    public void change() {
        out.println("客户要求变更一个需求");
    }

    @Override
    public void plan() {
        out.println("客户需要需求变更计划...");
    }

    @Override
    public void rollback() {

    }
}
