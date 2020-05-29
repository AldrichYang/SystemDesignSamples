package command;

/**
 * Created by yh on 2018/7/12.
 */
public abstract class Command {
    //把三个组类都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
